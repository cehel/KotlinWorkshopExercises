package com.zuehlke.NewsAnalyzerKotlin.model

import java.time.LocalDateTime


/* Created by celineheldner on 9/10/19
*/

data class NewsArticle (
        var status: String? = null,
        var totalResults: Int? = null,
        val articles: List<Article> = listOf()
)

data class Article (
        var source: ArticleSource? = null,
        var author: String? = null,
        var title: String? = null,
        var description: String? = null,
        var url: String? = null,
        var urlToImage: String? = null,
        var publishedAt: LocalDateTime? = null,
        var content: String? = null
)

data class ArticleSource (
    var id: String? = null,
    var name: String? = null
)

