package com.zuehlke.NewsAnalyzerKotlin.extensions

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


/* Created by celineheldner on 9/11/19 */

internal class StringExtensionsKtTest {

    @Test
    fun countOccurenceOf() {
        //given
        val testContent = "something is get here there why get keep getit"
        //when
        val count = testContent.countOccurenceOf("get")
        //then
        Assertions.assertEquals(2, count)
    }
}