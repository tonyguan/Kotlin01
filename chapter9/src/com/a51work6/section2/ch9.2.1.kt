/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/
//代码文件：chapter9/src/com/a51work6/section2/ch9.2.1.kt
package com.a51work6.section2

fun printArea1(width: Double, height: Double): Unit { //可以省略Unit
    val area = width * height
    println("$width x $height 长方形的面积:$area")
    return //可以省略return
}

fun printArea2(width: Double, height: Double) { //省略Unit
    val area = width * height
    println("$width x $height 长方形的面积:$area")
    //省略return
}

fun main(args: Array<String>) {
    printArea1(320.0, 480.0)
    printArea2(320.0, 480.0)
}