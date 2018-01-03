/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/
//代码文件：chapter9/src/com/a51work6/section6/ch9.6.kt
package com.a51work6.section6

fun calculate(n1: Int, n2: Int, opr: Char): Int {

    val multiple = 2

    val resultFun = if (opr == '+')
        //声明相加匿名函数
        fun(a: Int, b: Int): Int {
            return (a + b) * multiple
        }
    else
        //声明相减匿名函数
        fun(a: Int, b: Int): Int = (a - b) * multiple
    return resultFun(n1, n2)
}

fun main(args: Array<String>) {
    println(calculate(10, 5, '+')) //输出结果是30
}