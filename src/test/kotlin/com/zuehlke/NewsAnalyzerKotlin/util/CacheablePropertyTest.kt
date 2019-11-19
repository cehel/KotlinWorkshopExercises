package com.zuehlke.NewsAnalyzerKotlin.util

import com.zuehlke.NewsAnalyzerKotlin.common.TestNewsArticle
import com.zuehlke.NewsAnalyzerKotlin.model.KeywordSearchResult
import com.zuehlke.NewsAnalyzerKotlin.service.AnalyzeService
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.time.LocalDate

/* Created by celineheldner on 19/11/19 */

class UsingCacheTestClass(val analyzeService: AnalyzeService) {
    val resultNoCache: KeywordSearchResult by CacheableProperty(0, ::fetchResult)
    val resultHourCache: KeywordSearchResult by CacheableProperty(1, ::fetchResult)

    fun fetchResult(): KeywordSearchResult {
        return analyzeService.analyzeNewsWithKeyword( TestNewsArticle.newsArticle()!!, "test")
    }
}


internal class CacheablePropertyTest{

    val dataService: AnalyzeService = mockk<AnalyzeService>()
    lateinit var usingCache: UsingCacheTestClass


    @BeforeEach
    fun setup(){
        every { dataService.analyzeNewsWithKeyword(any(),"test") } returns KeywordSearchResult(LocalDate.now(), "", 1, 3)
        usingCache = UsingCacheTestClass(dataService)
    }

    @Test
    fun `When cached for 0 hours, generator is called every time`(){
        usingCache.resultNoCache
        usingCache.resultNoCache
        usingCache.resultNoCache

        verify(exactly = 3){dataService.analyzeNewsWithKeyword(any(), "test")}

    }

    @Test
    fun `When is cached for 1 hour, generator is called only once`(){
        usingCache.resultHourCache
        usingCache.resultHourCache
        usingCache.resultHourCache

        verify(exactly = 1){dataService.analyzeNewsWithKeyword(any(), "test")}
    }
}

