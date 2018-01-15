/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/
//代码文件：chapter9/src/com/a51work6/section8/ch9.8.1.kt
package com.a51work6.section8

private fun calculate(opr: Char): (Int, Int) -> Int {

    return when (opr) {
        '+' -> { a: Int, b: Int -> a + b }
        '-' -> { a: Int, b: Int -> a - b }
        '*' -> { a: Int, b: Int -> a * b }
        else -> { a: Int, b: Int -> a / b }
    }
}

//fun calculate(opr: Char): (Int, Int) -> Int = when (opr) {
//    '+' -> { a: Int, b: Int -> a + b }
//     '-' -> { a: Int, b: Int -> a - b }
//     '*' -> { a: Int, b: Int -> a * b }
//    else -> { a: Int, b: Int -> a / b }
//}

fun main(args: Array<String>) {
    val f1 = calculate('+')
    println(f1(10, 5))  //调用f1变量
    val f2 = calculate('-')
    println(f2(10, 5))
    val f3 = calculate('*')
    println(f3(10, 5))
    val f4 = calculate('/')
    println(f4(10, 5))
}