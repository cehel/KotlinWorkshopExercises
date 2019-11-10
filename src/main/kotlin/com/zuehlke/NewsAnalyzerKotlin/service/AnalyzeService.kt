package com.zuehlke.NewsAnalyzerKotlin.service

import com.zuehlke.NewsAnalyzerKotlin.extensions.countOccurenceOf
import com.zuehlke.NewsAnalyzerKotlin.model.KeywordSearchResult
import com.zuehlke.NewsAnalyzerKotlin.model.NewsArticle
import org.springframework.stereotype.Service
import java.time.LocalDate


/* Created by celineheldner on 9/10/19 */
@Service
class AnalyzeService {
    /*
    TODO Exercise 4:
    We would like to save in memory all the KeywordSearchResult that have been requested in a Collection
    We would like to log a message everytime an element has been added to this list
    Go to LoggableMutableList to implement this class using class delegation

     */

    fun analyzeNewsWithKeyword(newsArticle: NewsArticle, keyword: String): KeywordSearchResult{

        var totalNbrOfOccurences = 0
        var presentInNbrOfArticles = 0
        newsArticle.articles.forEach { article ->

            val countInArticle = article.content?.countOccurenceOf(keyword) ?: 0 // ?: Elvis operator, if is null then return what is after the operator

            totalNbrOfOccurences += countInArticle

            if (countInArticle > 0) {
                presentInNbrOfArticles++
            }
        }

        return KeywordSearchResult(LocalDate.now(), keyword, totalNbrOfOccurences, presentInNbrOfArticles)
    }

}