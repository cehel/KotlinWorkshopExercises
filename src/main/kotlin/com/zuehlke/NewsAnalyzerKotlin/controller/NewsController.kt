package com.zuehlke.NewsAnalyzerKotlin.controller

import com.zuehlke.NewsAnalyzerKotlin.model.KeywordSearchResult
import com.zuehlke.NewsAnalyzerKotlin.service.AnalyzeService
import com.zuehlke.NewsAnalyzerKotlin.service.news.NewsDataService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


/* Created by celineheldner on 2019-10-07 */

@RestController
class NewsController(val newsService: NewsDataService,
                     val analyzeService: AnalyzeService) {

    @GetMapping("/api/news")
    fun fetchNews() = newsService.newsArticle

    @GetMapping("/api/analyze/news")
    fun analyzeNews(@RequestParam keyword: String): KeywordSearchResult {
        val newsArticle = newsService.newsArticle
        return analyzeService.analyzeNewsWithKeyword(newsArticle, keyword)
    }
}