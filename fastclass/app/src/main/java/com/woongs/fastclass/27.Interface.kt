package com.woongs.fastclass


// - 인터페이스는 약속 !
// 인터페이스는 상속받은 클래스는 무조건 인터페이스안의 메소드들을 써줘야함
// - 생성자가 없다 ( 클래스이름옆에 이거() )-> 인스턴스화 시킬수 없다 -> 설명서가 아니다!
// - 지침서 -> 이것을구현하고싶다면 반드시 아래 기능을 구현해라!
// 협업할때 사용함

// 상속과 다른점
// - 상속은 조상을 찾아가는 느낌
// - 인터페이스는 종의 특

fun main() {
    val student = Student()
    student.eat()
    student.sleep()
}

interface Person_{
    fun eat()
    fun sleep()
}
open class Person(){

    open fun eat(){

    }
    fun sleep(){

    }
}

class Student() : Person_{
    override fun eat() {

    }

    override fun sleep() {
    }
}

class SoccerPlay() : Person_{
    override fun eat() {

    }

    override fun sleep() {

    }
}
// 오버로딩
// 같은 이름의 메소드를 매개변수와 유형이 서로 다르게 생성하는것
// 오버라이딩
// 부모클래스의 메소드를 자식클래스에서 재정의해서 사용