package com.zuehlke.NewsAnalyzerKotlin


import com.zuehlke.NewsAnalyzerKotlin.service.news.NewsService
import com.zuehlke.NewsAnalyzerKotlin.service.news.NewsServiceLocal
import com.zuehlke.NewsAnalyzerKotlin.service.news.NewsServiceRemote
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class NewsAnalyzerKotlinApplication{
	@Value("\${newsanalyzer.isMock}")
	lateinit var isMock: String

	@Value("\${newsapi.apikey}")
	lateinit var newsApiKey: String

	@Value("\${newsapi.baseUrl}")
	lateinit var newsApiBaseUrl: String

	@Bean
	fun newsService(): NewsService {
		if ( "true"==isMock ) {
			return NewsServiceLocal()
		}
		return NewsServiceRemote(apiKey = newsApiKey, baseUrl = newsApiBaseUrl)
	}
}

fun main(args: Array<String>) {
	runApplication<NewsAnalyzerKotlinApplication>(*args)
}
