/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/
//代码文件：chapter9/src/com/a51work6/section7/ch9.7.2.kt
package com.a51work6.section7

fun calculate(opr: Char): (Int, Int) -> Int {

    //加法函数
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    //减法函数
    fun sub(a: Int, b: Int): Int {
        return a - b
    }

    val result: (Int, Int) -> Int =
            when (opr) {
                '+' -> ::add
                '-' -> ::sub
                '*' -> {
                    //乘法匿名函数
                    fun(a: Int, b: Int): Int {
                        return (a * b)
                    }
                }
                else -> { a, b -> (a / b) } //除法Lambda表达式
            }
    return result
}

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