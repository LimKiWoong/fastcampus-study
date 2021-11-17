package com.woongs.fastclass

fun main(array: Array<String>){

// ImMutable

    // List => 중복허용
    val numberList = listOf<Int>(1,2,3,4,4,4)

    // Set => 중복 허용X , index가 없
    val numberSet = setOf<Int>(1,2,2,3,3,4)
    numberSet.forEach {
        println(it)
    }

    // Map => key,value
    val numberMap = mapOf<String,Int>("one" to 1 , "two" to 2 , "three" to 3)
    println("Map => " + numberMap.get("one"))


// Mutable

    // MutableList
    val mNumberList = mutableListOf<Int>(1,2,3)
    mNumberList.add(3,4)
    println("mutableList => " + mNumberList)

    // MutableSet
    val mNumberSet = mutableSetOf<Int>(1,2,2,3,3,4,4,4)
    mNumberSet.add(5)
    println("mutableSet => " + mNumberSet)

    // MutableMap
    val mNumberMap = mutableMapOf<String,Int>("one" to 1 , "two" to 2)
    mNumberMap.put("three" ,3)
    println("mutableMap => " + mNumberMap)
}