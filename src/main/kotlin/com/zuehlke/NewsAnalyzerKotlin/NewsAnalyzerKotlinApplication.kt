package com.zuehlke.NewsAnalyzerKotlin

import com.zuehlke.NewsAnalyzerKotlin.data.NewsDataService
import com.zuehlke.NewsAnalyzerKotlin.data.NewsDataServiceLocal
import com.zuehlke.NewsAnalyzerKotlin.data.NewsDataServiceRemote
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
	fun newsService(): NewsDataService {
		if ( "true"==isMock ) {
			return NewsDataServiceLocal()
		}
		return NewsDataServiceRemote(apiKey = newsApiKey, baseUrl = newsApiBaseUrl)
	}
}

fun main(args: Array<String>) {
	runApplication<NewsAnalyzerKotlinApplication>(*args)
}
