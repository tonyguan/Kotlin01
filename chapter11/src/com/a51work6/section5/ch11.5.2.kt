/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/
//代码文件：chapter11/src/com/a51work6/section5/ch11.5.2.kt
package com.a51work6.section5

fun square(num: Int): Int = num * num

fun main(args: Array<String>) {
    val n1: Int? = 10 //null
    //自己进行非空判断
    if (n1 != null) {
        println(square(n1))
    }
    //使用let函数
    n1?.let { n -> println(square(n)) }
    n1?.let { println(square(it)) }

}