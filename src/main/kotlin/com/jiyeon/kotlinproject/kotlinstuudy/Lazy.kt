package com.jiyeon.kotlinproject.kotlinstuudy

fun main() {
    val user: Lazy by lazy { Lazy ("name" , 10)}

}

class Lazy(name:String, age: Int) {

    init {
        println("init ! $name $age")
    }
}