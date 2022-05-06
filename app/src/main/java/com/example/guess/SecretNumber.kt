package com.example.guess

import java.util.*

class SecretNumber(){
    val secret : Int = Random().nextInt(10) +1
    var count : Int = 0

    fun vaildate(number : Int) : Int{
        count ++
        return number - secret
    }
}
fun main(){
    val secretNumber = SecretNumber()
    println(secretNumber.secret)
    println("${secretNumber.vaildate(2)}, count: ${secretNumber.count}")
}