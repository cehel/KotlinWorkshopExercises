package com.zuehlke.RedditAnalyzerKotlin

import com.zuehlke.NewsAnalyzerKotlin.service.news.NewsService
import com.zuehlke.RedditAnalyzerKotlin.service.NewsServiceRemote
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


/* Created by celineheldner on 2019-10-07 */

@RestController
class NewsController(val service: NewsService) {

    @GetMapping("/api/reddit/kotlin")
    fun kotlinReddit() = service.fetchNews()
}