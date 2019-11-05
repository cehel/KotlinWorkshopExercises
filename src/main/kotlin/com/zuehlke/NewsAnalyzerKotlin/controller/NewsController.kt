package com.zuehlke.RedditAnalyzerKotlin

import com.zuehlke.NewsAnalyzerKotlin.service.news.NewsDataService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


/* Created by celineheldner on 2019-10-07 */

@RestController
class NewsController(val service: NewsDataService) {

    @GetMapping("/api/news")
    fun fetchNews() = service.fetchNews()
}