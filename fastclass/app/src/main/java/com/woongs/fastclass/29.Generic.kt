package com.woongs.fastclass

// 목적 : 타입을 체크하는 기능
// - 제너릭은 만들기 어렵고 실제로 만들기 어렵기때문에
// - 사용법만 숙지한다.

fun main() {
    // 제너릭을 사용안한경우
    val list1 = listOf(1,2,3,"가") // -> Any
    val b :String = list1[2].toString()

    // 제너릭 사용하는경우 -> 타입이 안전하다
    val list2 = listOf<String>("a","b","c")
    val c : String = list2[2]

    // 부모 : Any
    // 자식 : String Int Float ...
}