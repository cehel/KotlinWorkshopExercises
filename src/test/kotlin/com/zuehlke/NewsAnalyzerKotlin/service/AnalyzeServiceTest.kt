package com.zuehlke.NewsAnalyzerKotlin.service

import com.zuehlke.NewsAnalyzerKotlin.common.TestNewsArticle
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

/* Created by celineheldner on 10/11/19 */

internal class AnalyzeServiceTest {

    val testSubject = AnalyzeService()

    companion object {
        @JvmStatic
        fun data() = listOf(
                TestArguments(keyword = "Brexit", totalNbr = 1, articleNbr = 1),
                TestArguments(keyword = "to", totalNbr = 6, articleNbr = 4),
                TestArguments(keyword = "climate", totalNbr = 1, articleNbr = 1)
        )
    }


    data class TestArguments(
            val keyword: String,
            val totalNbr: Int,
            val articleNbr: Int
    )

    @ParameterizedTest
    @MethodSource("data")
    fun analyzeNewsWithKeyword(testArgument : TestArguments) {
        //given
        val (keyword, totalNbr, articleNbr) = testArgument
        val newsArticles = TestNewsArticle.newsArticle()

        //when
        val analyzeResult = testSubject.analyzeNewsWithKeyword(newsArticles!!, keyword)

        //then
        assertEquals(keyword, analyzeResult.keyword)
        assertEquals(articleNbr, analyzeResult.presentInNbrOfArticles)
        assertEquals(totalNbr, analyzeResult.totalCount)
    }
}