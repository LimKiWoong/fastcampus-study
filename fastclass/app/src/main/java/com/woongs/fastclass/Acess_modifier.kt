package com.woongs.fastclass

fun main(array: Array<String>){
    val testAccess : TestAccess = TestAccess("아무개")
    testAccess.test()
    //testAccess.name = "아무개 투"

    val reward = Reward()
    reward.rewardAmount=2000
}

class Reward() {
    var rewardAmount : Int = 100
}

class TestAccess {

    private var name : String = "홍길동"

    constructor(name: String) {
        this.name = name
    }

    fun test() {
        println("테스트")
    }
}