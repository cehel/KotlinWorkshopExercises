package com.zuehlke.NewsAnalyzerKotlin.service

import com.zuehlke.NewsAnalyzerKotlin.model.KeywordSearchResult
import com.zuehlke.NewsAnalyzerKotlin.model.NewsArticle
import org.springframework.stereotype.Service


/* Created by celineheldner on 9/10/19 */
@Service
class AnalyzeService {

    fun analyzeNewsWithKeyword(newsArticle: NewsArticle, keyword: String): KeywordSearchResult{
        TODO("Exercise 2")
        /*
            TODO Exercise 2:
            Check the data class KeywordSearchResult.
            1.  Count the number of occurences of the keyword in the content of the article.
                To do so, create an extension function in StringExtensions which counts the nbr of keywords in a string.
            2.  Count the number of articles containing a keyword
            3.  Return the filled in KeywordSearchResult
         */

    }

}