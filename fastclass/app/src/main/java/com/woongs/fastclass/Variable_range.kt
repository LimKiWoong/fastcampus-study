package com.woongs.fastclass

var number: Int = 10

fun main(array: Array<String>) {
    println(number)
}

class Test(var name: String) {

    fun testFun() {
        name = "홍길동"
        number = 100
        println(number)
    }
}