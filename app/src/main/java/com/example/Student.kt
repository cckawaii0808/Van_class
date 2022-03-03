package com.example

import androidx.core.os.persistableBundleOf
class Student //constructor//類別的可省略 裡面的不可以
 (var name:String, var math:Int, var english:Int) {  //只有主要建構值可以用var val
    //var name :String?=null
    //var english:Int= 0
    //var math:Int= 0
    constructor():this("",0 ,0)//次要建構子要定義上面的初始值
    constructor(name: String):this(name,0,0)
    {
        print("Hi")
    }
    fun print(){
        println("$name\t$english\t$math\t${(english+math)/2.0f}")
    }
    fun average():Float {
    return (english+math) /2.0f
    }
}
fun main() {
    val jack = Student("Jack",85,74)
    val cc=Student("cc")
    //jack.name= "Jack"
    //jack.english=85
    //jack.math=60
    jack.print()
    cc.print()
}