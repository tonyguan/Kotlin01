/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/
//代码文件：chapter11/src/com/a51work6/section3/ch11.3.4.kt
package com.a51work6.section3

//累加求和函数
fun sum(vararg num: Int): Int {

    var total = 0
    num.forEach {
        //if (it == 10) return -1   //返回最近的函数
        if (it == 10) return@forEach//返回Lambda表达式函数
        total += it
    }
    return total
}

fun main(args: Array<String>) {

    val n = sum(1, 2, 10, 3)
    println(n)  //6

    val add = label@ {
        val a = 1
        val b = 2
        return@label 10
        a + b
    }
    //调用Lambda表达式add
    println(add())  //10

}