/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/
//代码文件：chapter6/src/com/a51work6/section1/ch6.1.1.kt
package com.a51work6.section1

fun main(args: Array<String>) {

    val s1 =""
    val s2 = "Hello World"
    val s3 = "\u0048\u0065\u006c\u006c\u006f\u0020\u0057\u006f\u0072\u006c\u0064"
    println(s2 == s3)//输出结果为true

    val s4 = "Hello\nWorld"
    val s5 = """Hello
World"""
    println(s4 == s5)//输出结果为true

    val s6 = """Hello\nWorld"""
    println(s6)
}