package com.zuehlke.NewsAnalyzerKotlin.util


/* Created by celineheldner on 10/11/19 */
    
/*
TODO Exercise 4: Create a a LoggableCollection class
  it should implement all the features of a MutableCollection
  additionally to that it should log a message each time something has been added to the List

  Use class delegation to implement such a List
 */

class LoggableCollection<T>(val collection: MutableCollection<T>): MutableCollection<T> by collection {
    override fun add(element: T): Boolean {
        println("Add element $element to list")
        return collection.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        println("Add elements $elements to List")
        return collection.addAll(elements)
    }
}