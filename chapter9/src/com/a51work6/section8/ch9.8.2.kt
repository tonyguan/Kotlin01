/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/
//代码文件：chapter9/src/com/a51work6/section8/ch9.8.2.kt
package com.a51work6.section8

//打印计算结果函数
fun calculatePrint(n1: Int,
                   n2: Int,
                   opr: Char,
                   funN: (Int, Int) -> Int) {//函数类型
    println("$n1 $opr $n2 = ${funN(n1, n2)}")
}

fun main(args: Array<String>) {
    calculatePrint(10, 5, '+', { a: Int, b: Int -> a + b })
    calculatePrint(10, 5, '-', funN = { a: Int, b: Int -> a - b })
}