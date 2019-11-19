package com.zuehlke.NewsAnalyzerKotlin.extensions


/* Created by celineheldner on 9/11/19 */

fun String.countOccurenceOf(keyword: String) = this.split("\\s".toRegex()).filter{it == keyword}.count()
