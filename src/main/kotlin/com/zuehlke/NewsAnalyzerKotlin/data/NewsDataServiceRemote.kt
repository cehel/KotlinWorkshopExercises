package com.zuehlke.NewsAnalyzerKotlin.data

import com.zuehlke.NewsAnalyzerKotlin.data.NewsDataService
import org.springframework.core.ParameterizedTypeReference
import org.springframework.http.*
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.exchange
import java.lang.Exception
import java.net.URI
import java.util.*


/* Created by celineheldner on 2019-10-06 */

class NewsDataServiceRemote(val apiKey:String, val baseUrl: String): NewsDataService {

    val entity: RequestEntity<String> //TODO: Exercise 1: Change Type to NewsArticle
    val restTemplate = RestTemplate()

    init {
        val headers =  HttpHeaders()
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON))
        val endpoint = URI.create("${baseUrl}?sources=bbc-news&apiKey=${apiKey}")
        entity = RequestEntity(HttpMethod.GET, endpoint)
    }

    /*
    TODO: Exercise 1: This method should return the type NewsArticle instead of a String
     */
    override fun fetchNews(): String {
        val respType = object: ParameterizedTypeReference<String>(){}

        val response: ResponseEntity<String> = restTemplate.exchange(
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