/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/
//代码文件：chapter6/src/com/a51work6/section2/ch6.2.2.kt
package com.a51work6.section2

fun main(args: Array<String>) {

    val s1 = "Hello"
    // 使用+运算符连接
    val s2 = s1 + " "
    val s3 = s2 + "World"
    println(s3)//Hello World

    var s4 = "Hello"
    // 使用+运算符连接，支持+=赋值运算符
    s4 += " "
    s4 += "World"
    println(s4)//Hello World

    val age = 18
    val s5 = "她的年龄是" + age + "岁。"
    println(s5)//她的年龄是18岁。

    val score = 'A'
    val s6 = "她的英语成绩是" + score
    println(s6)//她的英语成绩是A

    val now = java.util.Date()
    //对象拼接自动调用toString()方法
    val s7 = "今天是：" + now
    println(s7)

}