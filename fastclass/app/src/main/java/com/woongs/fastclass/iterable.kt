package com.woongs.fastclass

fun main(array: Array<String>){

    val a = mutableListOf<Int>(1,2,3,4,5,6,7,8,9)

    // 반복하는방법 (1)
    for (i in a){
//        if( i == 6){
//            println("6입니다")
//        } else{
//            println(i)
//        }
    }

    // 반복하는법 (2)
    for ( (index,i) in a.withIndex()){
        //println("index : " + index+ " value : " +i)
    }

    // 반복하는법 (3) 람다문법 ,활용도 높음
    a.forEach {
        println(it)
    }
    println()

    // 반복하는법 (4)
    a.forEach {item ->
        println(item)
    }
    println()

    // 반복하는법 (5)
    a.forEachIndexed { index, i ->
        println("index : " + index+ " value : " +i)
    }

    // 반복하는방법(6)
    for (i in 0 until a.size){
        // until은 마지막을 포함하지 않는다
        println(a.get(i))
    }
println()

    // 반복하는방법(7)
    for (i in 0 until a.size step 2){
        println(a.get(i))
    }
println()

    // 반복하는방법(8)
    for (i in a.size-1 downTo  0){
        println(a.get(i))
    }
println()

    // 반복하는법(9)
    for (i in a.size-1 downTo 0 step 2){
        println(a.get(i))
    }
println()

    // 반복하는법(10)
    for (i in 0..10){
        // ..은 마지막을 포함하고 until은 마지막을 포합하지 않는다.
        println(i)
    }
println()

    //반복하는법(11)
    var b=0
    var c=3

    while (b<c){
        b++
        println(b)
    }
println()

    // 반복하는법(12)
    b=0
    do {
        b++
        println(b)
    } while (b<c)
}