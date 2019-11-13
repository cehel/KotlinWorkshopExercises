package com.zuehlke.NewsAnalyzerKotlin.service.news

import com.zuehlke.NewsAnalyzerKotlin.service.news.NewsService
import org.springframework.http.*
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.exchange
import java.lang.Exception
import java.util.*


/* Created by celineheldner on 2019-10-06 */

class NewsServiceRemote(val apiKey:String, val baseUrl: String): NewsService {

    val entity: HttpEntity<String>
    val restTemplate = RestTemplate()

    init {
        val headers =  HttpHeaders()
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON))
        entity = HttpEntity(headers)
    }

    override fun fetchNews(): String {
        val response: ResponseEntity<String> = restTemplate.exchange(
                url = "${baseUrl}?sources=bbc-news&apiKey=${apiKey}",
                method = HttpMethod.GET,
                requestEntity = entity)
        if (response.statusCode != HttpStatus.OK) {
            throw Exception("There was an error fetching news ${response.statusCode}")
        }

        response.body?.let {
            return it
        }

        throw Exception("The news Service could not be reached")
    }
}