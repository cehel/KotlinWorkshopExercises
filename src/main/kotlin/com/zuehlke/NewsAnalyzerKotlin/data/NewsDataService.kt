package com.zuehlke.NewsAnalyzerKotlin.data

import org.springframework.http.ResponseEntity


/* Created by celineheldner on 9/10/19 */

interface NewsDataService {
    fun fetchNews(): String
}