package com.zuehlke.NewsAnalyzerKotlin.util


/* Created by celineheldner on 10/11/19 */
    


class CacheableProperty() {
    /*
    TODO Exercise 3
    Create a Property Delegate called Cache. It takes as a constructor argument a duration and a generator-function.
    The duration specifies how long the property will be cached. If the time is over, it will use the generator-function to regenerate the value
    The generator-function is only called if the value is not set, or the duration is exceeded.

    Implement the property delegation and its two operator functions, such that it matches the above requirements.
    Check https://kotlinlang.org/docs/reference/delegated-properties.html for information on how to implement a delegated properties class


    --Optional or for at home exercise:
    Guava has a nice library for caching, it takes care of many things (also thread safety) related to caching. We can import the library in our build.gradle.kts
    and change the above implementation to use the guava cache. The key can be the KProperty itself
     */
}