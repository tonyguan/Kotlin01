/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/
//代码文件：chapter13/src/main/kotlin/com/a51work6/section3/s1/ch13.3.2.kt
@file:JvmName("PackageLevelDemo")

package com.a51work6.section3.s1

//顶层函数
fun rectangleArea(width: Double, height: Double): Double {
    val area = width * height
    return area
}

//顶层属性
val area = 100.0
