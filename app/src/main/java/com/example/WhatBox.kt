package com.example




//box1 10 10 10
//box2 10 10 15
//box3 10 15 15

class WhatBox(var length:Int,var width:Int,var height:Int) {


}
fun main() {
    var length = 0
    var width = 0
    var height = 0
    var i=0
    println("請輸入長")
    readLine()?.let {
        length = it.toInt()
        println("請輸入寬")
        readLine()?.let {
            width = it.toInt()
            println("請輸入高")
            readLine()?.let {
            height = it.toInt()
            }
        }
    }
    if(length>15||height>15||width>15){i=4}
    if (width>10&&width<=15){
        i++
    }
        if (length>10&&length<=15){
            i++
    }
    if (height>10&&height<=15){
        i++
    }
    if (i==0){(print("box1"))}
    else if (i==1){print("box2")}
    else if (i==2){print("box3")}
    else {print("no box can use")}


}