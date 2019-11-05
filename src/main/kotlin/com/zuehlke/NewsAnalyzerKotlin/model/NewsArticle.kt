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
        val status: String,
        val totlaResults: Int,
        val articles: List<Article>
)

data class Article (
        val source: ArticleSource,
        val author: String,
        val title: String,
        val description: String,
        val url: String,
        val urlToImate: String,
        val publishedAt: LocalDateTime,
        val content: String
)

data class ArticleSource (
    val id: String,
    val name: String
)

