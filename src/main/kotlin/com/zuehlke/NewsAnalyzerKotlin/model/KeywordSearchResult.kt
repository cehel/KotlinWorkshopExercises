package com.zuehlke.NewsAnalyzerKotlin.model

import java.time.LocalDate


/* Created by celineheldner on 9/11/19 */
    
data class KeywordSearchResult(
        val date: LocalDate,
        val keyword: String,
        val totalCount: Int,
        val presentInNbrOfArticles: Int
)