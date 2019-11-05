package com.zuehlke.NewsAnalyzerKotlin.service.news

import com.zuehlke.NewsAnalyzerKotlin.model.NewsArticle
import org.springframework.http.ResponseEntity


/* Created by celineheldner on 9/10/19 */

interface NewsDataService {
    fun fetchNews(): NewsArticle
}