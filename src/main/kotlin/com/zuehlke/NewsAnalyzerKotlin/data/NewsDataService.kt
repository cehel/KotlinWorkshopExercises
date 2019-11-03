package com.zuehlke.NewsAnalyzerKotlin.service.news

import org.springframework.http.ResponseEntity


/* Created by celineheldner on 9/10/19 */

interface NewsDataService {
    fun fetchNews(): String
}