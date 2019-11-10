package com.zuehlke.NewsAnalyzerKotlin.service.news

import com.zuehlke.NewsAnalyzerKotlin.model.NewsArticle


/* Created by celineheldner on 9/10/19 */

interface NewsDataService {
    //TODO Exercise 3 use a property instead of a function
    fun fetchNews(): NewsArticle
}