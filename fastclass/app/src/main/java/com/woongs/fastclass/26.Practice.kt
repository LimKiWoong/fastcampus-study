package com.woongs.fastclass

// 과제
// Night , Monster (부모)
// SuperNight, SuperMonster (자식)

fun main(array: Array<String>) {
    val superNight = SuperNight(100,20)
    val superMonster = SuperMonster(120,15)

    superMonster.bite(superNight)
}

// 상속이 만들어낸 특징
// --자식 클래스는 부모 클래스의 타입이다.
// --허나 부모클래스는 자식클래스 타입이 아니다!!

open class Charator(var hp: Int, var power: Int) {

    fun attack(charator: Charator, power: Int = this.power) {
        charator.defense(power)
    }

    open fun defense(damage: Int) {
        hp -= damage
        if (hp > 0) {
            println("${javaClass.simpleName} 현재 체력은 $hp 입니다.")
        } else println("${javaClass.simpleName}이(가) 죽었습니다.")
    }

}

// 자식

class SuperNight(hp: Int,power: Int) : Charator(hp,power){
    val defensePower = 2
    override fun defense(damage: Int) {
        super.defense(damage -defensePower)
    }
}

class SuperMonster(hp: Int, power: Int) : Charator(hp,power){
    fun bite(charator: Charator){
        super.attack(charator,power+2)
    }
}