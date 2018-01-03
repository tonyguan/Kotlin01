/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/
//代码文件：chapter9/src/com/a51work6/section1/ch9.1.kt
package com.a51work6.section1

fun rectangleArea(width: Double, height: Double): Double {
    val area = width * height
    return width * height
}

fun main(args: Array<String>) {
    println("320x480的长方形的面积:${rectangleArea(320.0, 480.0)}")
}