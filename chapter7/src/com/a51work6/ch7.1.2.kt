/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/
//代码文件：chapter7/src/com/a51work6/ch7.1.2.kt
package com.a51work6

fun main(args: Array<String>) {
    //声明一个字符类型变量
    val charNum = 'A'   //'A'字符的Unicode编码是65
    // 声明一个整数类型变量
    var intResult = charNum.toInt() + 1
    println(intResult)  //输出66

    intResult = intResult - 1
    println(intResult)  //输出65

    intResult = intResult * 2
    println(intResult)  //输出130

    intResult = intResult / 2
    println(intResult)  //输出65

    intResult = intResult + 8
    intResult = intResult % 7
    println(intResult)  //输出3

    println("-------")

    // 声明一个浮点类型变量
    var doubleResult = 10.0
    println(doubleResult)  //输出10.0

    doubleResult = doubleResult - 1
    println(doubleResult)  //输出9.0

    doubleResult = doubleResult * 2
    println(doubleResult)  //输出18.0

    doubleResult = doubleResult / 2
    println(doubleResult)  //输出9.0

    doubleResult = doubleResult + 8
    doubleResult = doubleResult % 7
    println(doubleResult)  //输出3.0

}