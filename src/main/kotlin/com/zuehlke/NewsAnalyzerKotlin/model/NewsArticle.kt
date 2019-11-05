package com.zuehlke.NewsAnalyzerKotlin.model

import java.time.LocalDateTime


/* Created by celineheldner on 9/10/19
*
* TODO: Exercise 1:
* Create a model which represents the NewsArticle you receive in the JSON
*   1. Create a class with the name NewsArticle (getters, equals and copy included - think about data classes in Kotlin)
*   2. Create the immutable properties author, title, description, url and content.
* */
data class NewsArticle (
        val status: String? = null,
        val totalResults: Int? = null,
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

