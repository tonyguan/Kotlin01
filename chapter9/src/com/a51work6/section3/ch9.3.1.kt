/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/
//代码文件：chapter9/src/com/a51work6/section3/ch9.3.1.kt
package com.a51work6.section3

fun printArea(width: Double, height: Double): Unit {
    val area = width * height
    println("$width x $height 长方形的面积:$area")
}

fun main(args: Array<String>) {
    printArea(320.0, 480.0)	//没有采用命名函数调用
    printArea(width = 320.0, height = 480.0)//采用命名函数调用
    printArea(320.0, height = 480.0)//采用命名函数调用
    //printArea(width = 320.0,  480.0) //编译错误
}