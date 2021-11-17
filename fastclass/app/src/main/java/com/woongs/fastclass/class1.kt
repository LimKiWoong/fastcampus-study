package com.woongs.fastclass

fun main(array:Array<String>){
//    val bestDriver:BestDriver =
//            BestDriver("V9","besthandle")
//    bestDriver.drive()

//    val fuckingDriver : FuckingDriver =
//            FuckingDriver("V8","goodhandle")
//    fuckingDriver.drive()

    val testClass = TestClass()
    testClass.test(1)
    testClass.test(1,2)

}

class BestDriver(engine: String,handle: String){
    var engine:String = ""
    var handle:String  = ""
    fun drive(){
        print("엔진은 $engine 입니다")
        print("핸들은 $handle 입니다")
    }
}
// 위의 클래스와 아래의 클래스는 동일
class FuckingDriver {
    var engine:String
    var handle:String

    constructor(engine: String,handle: String){
        this.engine = engine
        this.handle = handle
    }
    // 클래스가 인스턴스화 될때 무조건 호춣하는 메소드
    init {
        // 초기세팅할때 유용하다.
        println("FuckingDriver가 만들어졌습니다.")

    }
    fun drive(){
        print("엔진은 $engine 입니다")
        print("핸들은 $handle 입니다")
    }
}

//  오버로딩
class TestClass(){
    fun test(int1 : Int){
        print("$int1")
    }
    fun test(int1 : Int,int2 : Int){
        print("\n $int1 , $int2")
    }

}