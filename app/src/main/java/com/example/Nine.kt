package com.example


fun main() {
    for(i in 2..9 ){
        for(j in 1..9){
          print("$i x $j=${if (i*j<10)" " else ""}${i*j}  ")
            }
        println()
        }
    val n=30
    println((1..n).random())

    }
//123
class Nine {
}