package com.zuehlke.NewsAnalyzerKotlin.service.news

import com.zuehlke.NewsAnalyzerKotlin.model.NewsArticle


/* Created by celineheldner on 9/10/19 */

interface NewsDataService {
    fun fetchNews(): NewsArticle
}