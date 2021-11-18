package com.woongs.fastclass

fun main(array: Array<String>) {
    val superCar100 = SuperCar100()
    superCar100.drive()
}

// 클래스를 처음 생성할때 자동으로 private가 붙는다
// 즉 앞에 open을 붙여서 다른 클래스도 사용할수있게 만들어줘야한다.
open class Car100(){
    fun drive(){

    }
    fun stop(){

    }
}

class SuperCar100() : Car100() {

}
class Bus100() : Car100(){

}