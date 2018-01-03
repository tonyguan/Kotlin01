/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/

//代码文件：chapter7/src/com/a51work6/ch7.3.kt
package com.a51work6

fun main(args: Array<String>) {

    val i = 0
    var a = 10
    var b = 9

    if (a > b || i == 1) {
        println("或运算为 真")
    } else {
        println("或运算为 假")
    }

    if (a < b && i == 1) {
        println("与运算为 真")
    } else {
        println("与运算为 假")
    }

    if (a > b || a++ == --b) {
        println("a = " + a)
        println("b = " + b)
    }
}