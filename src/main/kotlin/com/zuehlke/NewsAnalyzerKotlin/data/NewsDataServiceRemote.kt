package com.zuehlke.NewsAnalyzerKotlin.service

import com.zuehlke.NewsAnalyzerKotlin.model.NewsArticle
import com.zuehlke.NewsAnalyzerKotlin.service.news.NewsDataService
import org.springframework.core.ParameterizedTypeReference
import org.springframework.http.*
import org.springframework.web.client.RestTemplate
import java.lang.Exception
import java.net.URI
import java.util.*


/* Created by celineheldner on 2019-10-06 */

class NewsDataServiceRemote(val apiKey:String, val baseUrl: String): NewsDataService {

    val entity: RequestEntity<NewsArticle>
    val restTemplate = RestTemplate()

    /*
    TODO Exercise 3:
    It is unnecessary to fetch the news for every incoming request. The response of the news-api should be cached in memory for at least one day.
    We will store the response in a property of this class. Using property delegation we will create an easy-to-use cache, which can be reused on other properties.
        1.  Create a property "newsArticle" of type NewsArticle
        2.  Go to CacheableProperty and implement a Property delegation according to the description there
        3.  Use the created property delegation on the property "newsArticle", f. ex:
            val newsArticle by CacheableProperty(24, ::fetchNews())

        4.  For consistency you could change the NewsDataService interface to add the newsArticle property instead of the fetchNews function
            Then you can make the fetchNews function private and override the property
     */

    init {
        val headers =  HttpHeaders()
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON))
        val endpoint = URI.create("${baseUrl}?sources=bbc-news&apiKey=${apiKey}")
        entity = RequestEntity(HttpMethod.GET, endpoint)
    }

    //TODO Exercise 3 use the above created property instead of a function, make this function private
    override fun fetchNews(): NewsArticle {
        val respType = object: ParameterizedTypeReference<NewsArticle>(){}

        val response: ResponseEntity<NewsArticle> = restTemplate.exchange(
                entity, respType)
        if (response.statusCode != HttpStatus.OK) {
            throw Exception("There was an error fetching news ${response.statusCode}")
        }

        response.body?.let {
            return it
        }

        throw Exception("The news Service could not be reached")
    }
}