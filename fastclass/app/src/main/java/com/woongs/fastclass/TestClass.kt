package com.woongs.fastclass

// 1) 사칙 연산을 수행할 수 있는 클래스

// 2) 은행 계좌 만들기
//- 계좌 생성 가능 (이름,샌년월일)
//- 잔고를 확인 하는 기능
//- 출금 기능
//- 예금 기능

// 3) TV클래스
//- on/off 기능
//- 채널을 돌리는 기능
//- 초기 채널은 (S사 M사 K사 3개)

fun main(array: Array<String>) {
//    val number = Calculaotr1()
//    println(number.plus(2,5))
//    println(number.minus(6,1))
//    println(number.goopsam(3,4))
//    println(number.nanutsam(9,2))

//    val calculator2 = Calculator2()
//    println(calculator2.plus(1, 2, 3, 4, 5))
//    println(calculator2.minus(3, 4, 5))
//    println(calculator2.multiply(5, 4, 2, 1))
//    println(calculator2.divide(10,2,3,0,0,1))

//    val calculator3 = Calculator3(3)
//    calculator3.plus(5).minus(2).multiply(3)
//    // 이런것을 Chaining(체이닝) 이라고한
//
//    val account2 = Account2("임기웅", "980810")
//    account2.deposit(3000)
//    println(account2.checkBalance())

    val tv = TV1(listOf<String>("K", "M", "S"))
    tv.channelUp()
    tv.channelUp()
    tv.channelUp()
    tv.channelDown()
    tv.curreentChanellNumber = 10
    println(tv.checkCurrentChannels())

}

class Calculaotr1() {
    fun plus(a: Int, b: Int): Int {
        return a + b
    }

    fun minus(a: Int, b: Int): Int {
        return a - b
    }

    fun goopsam(a: Int, b: Int): Int {
        return a * b
    }

    fun nanutsam(a: Int, b: Int): Int {
        return a / b
    }
}

class Calculator2() {
    fun plus(vararg numbers: Int): Int {
        var result = 0
        numbers.forEach {
            result += it
        }
        return result
    }

    fun minus(vararg numbers: Int): Int {
        var result: Int = numbers[0]
        for (i in 1 until numbers.size) {
            if (numbers.size >= 2) {
                result = result - numbers[i]
            }
        }
        return result
    }

    fun multiply(vararg numbers: Int): Int {
        var result: Int = 1
        numbers.forEach {
            if (it != 0) {
                result = result * it
            }
        }
        return result
    }

    fun divide(vararg numbers: Int): Int { //10.2.3
        var result: Int = numbers[0]
        numbers.forEachIndexed { index, i ->
            if (index != 0 && i != 0) {
                result = result / i
            }
        }
        return result
    }
}

class Calculator3(val initialValue: Int) {

    var sum: Int = 0

    fun plus(number: Int): Calculator3 {
        val result = initialValue + number
        sum += result
        return Calculator3(result)
    }

    fun minus(number: Int): Calculator3 {
        val result = initialValue - number
        sum -= number
        return Calculator3(result)
    }

    fun multiply(number: Int): Calculator3 {
        val result = initialValue * number
        sum *= result
        return Calculator3(result)
    }

    fun divide(number: Int): Calculator3 {
        val result = initialValue / number
        sum /= result
        return Calculator3(result)
    }
}

class Bank() {
    var cash: Int = 0

    fun createAccount(name: String, birth: String) {
        print("계좌를 생성하였습니다. 이름:$name 생년월일:$birth \n")
    }

    fun checkCash() {
        print("잔고는 현재 $cash 원 입니다.\n")
    }

    fun withdraw(cash: Int) {
        this.cash -= cash
        print("$cash 원을 출금하였습니다. 현재 잔고는 ${this.cash} 입니다.\n")
    }

    fun deposit(cash: Int) {
        this.cash += cash
        print("$cash 원을 예금하여 총 ${this.cash} 원입니다.\n")
    }
}

class Account2(val name: String, val birth: String, var balance: Int = 1000) {

    fun checkBalance(): Int {
        return balance
    }

    fun withdraw(amount: Int): Boolean {
        if (balance >= amount) {
            balance = balance - amount
            return true
        } else {
            return false
        }
    }

    fun deposit(amount: Int) {
        balance += amount
    }
}

// 클래스의 arg에 val 또는 var이 안붙어있을때 사용
class Account3(initialBalance: Int) {

    var balance = if (initialBalance > 0) initialBalance else 0
    fun checkBalance(): Int {
        return balance
    }

}

class TV() {
    var status: String = "off"
    var channel = arrayOf("S", "M", "K")
    fun onTV() {
        status = "on"
        print("$status")
    }

    fun offTV() {
        status = "off"
        print("$status")
    }
}

class TV1(val channels: List<String>) {

    var onOff: Boolean = false // true -> on , false -> off
    var curreentChanellNumber = 0
        //값을 할당할때 호출
        set(value) {
            // 절대 이렇게 값 넣어선 안됨 무한루프애 빠짐
            // curreentChanellNumber = value
            println("set호출")
            field = value
            if (field > 2) {
                field = 0
            } else if (field < 0) {
                field = channels.size - 1
            }
        }
        //불려나갈때 호출
        get() {
            println("get호출")
            return field
        }

    fun swith() {
        onOff = !onOff
    }

    fun checkCurrentChannels(): String {
        return channels[curreentChanellNumber]
    }

    fun channelUp() {
        curreentChanellNumber += 1
//        if (curreentChanellNumber >= channels.size) {
//            curreentChanellNumber = 0
//        }
        return
    }

    fun channelDown() {
        curreentChanellNumber -= 1
//        if (curreentChanellNumber < 0) {
//            curreentChanellNumber = channels.size - 1
//        }
        return
    }
}