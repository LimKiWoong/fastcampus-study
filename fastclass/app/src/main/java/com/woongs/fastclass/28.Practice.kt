package com.woongs.fastclass

// - 인터페이스도 구현이 있는 함수를 만들수있다.
// - 인터페이스에 구현된함수는 인터페이스를구현한클래스에서 구현한그함수를 구현할필요없다.

fun main(array: Array<String>) {
    val student = Student_()
    student.eat()
    student.sleep()
}

interface Person__{
    fun eat(){
        println("먹는다")
    }
    abstract fun sleep()
    // - abstract 는 반드시 구현해야할것으로 만들어준다
}


class Student_() : Person__{
    override fun sleep() {
        println("오호홍 잡시다")
    }
}

class SoccerPlay_() : Person__{
    override fun sleep() {
        println("잘시간")
    }
}