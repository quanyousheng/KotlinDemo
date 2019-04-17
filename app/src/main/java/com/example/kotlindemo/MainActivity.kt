package com.example.kotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    val list = listOf(1, 3, "sss")
    val map = mapOf<Int, String>(
        1 to "a",
        2 to "b",
        3 to "c"
    )

    //  方法扩展
    fun Int.triple(): Int {
        return this * 3
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var student0 = Student("张三", 10)
        var student1 = Student("李四", 20)
        val ageCompare = if (student0.age < student1.age)
            "young" else
            "old"

        println(ageCompare)
        println(5.triple())
        for (i in list) {
            println(i)
        }
        for ((key, value) in map) {
            println("key=$key,value=$value")
        }
        list.forEach { println("it=$it") }
        map.forEach { println("key=${it.key},value=${it.value}") }
    }
}
