/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/
//代码文件：chapter13/src/com/a51work6/section7/ch13.7.kt
package com.a51work6.section7

import java.lang.Math.abs

fun main(args: Array<String>) {

    val set = setOf(1, -3, 34, -54, 75)
    val charList = listOf("A", "B", "C")

    //升序
    println(set.sorted())//[-54, -3, 1, 34, 75]
    println(set.sortedBy { abs(it) })//[1, -3, 34, -54, 75]
    //降序
    println(set.sortedDescending())//[75, 34, 1, -3, -54]
    println(set.sortedByDescending { abs(it) })//[75, -54, 34, -3, 1]

    //倒置
    println(set.reversed())//[75, -54, 34, -3, 1]
}
