package com.zuehlke.RedditAnalyzerKotlin

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class NewsAnalyzerKotlinApplicationTests {

	@Test
	fun contextLoads() {
		val numbers = mutableListOf(1, 2, 3)
		numbers.filter(::isOdd)
	}

	fun isOdd(x: Int) = x %2 != 0

}
