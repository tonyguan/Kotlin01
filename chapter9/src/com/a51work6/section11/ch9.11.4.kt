/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/
//代码文件：chapter9/src/com/a51work6/section11/ch9.11.4.kt
package com.a51work6.section11

//求n的阶乘
fun factorial(n: Int) = IntArray(n) { it + 1 }
        .reduce { acc, i -> acc * i }

fun main(args: Array<String>) {

    println("1! = ${factorial(1)}") //输出：1! = 1
    println("2! = ${factorial(2)}") //输出：2! = 1
    println("5! = ${factorial(5)}") //输出：5! = 120
    println("10! = ${factorial(10)}") //输出：10! = 3628800
}

