package com.zuehlke.NewsAnalyzerKotlin.util


/* Created by celineheldner on 10/11/19 */
    
/*
TODO Exercise 4: Create a a LoggableCollection class
  it should implements all the features of a MutableCollection
  additionally to that it should log a message each time a result has been added or removed

  Use class delegation to implement such a List
 */

class LoggableMutableList<T>(val collection: MutableCollection<T>): MutableCollection<T> by collection {
    override fun add(element: T): Boolean {
        println("Add element $element to list")
        return collection.add(element)
    }
}