/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/

//代码文件：chapter8/src/com/a51work6/ch8.2.2.kt
package com.a51work6

fun main(args: Array<String>) {

    val testScore = 75  //设定一个数值用来测试
    val grade = when (testScore / 10) {
        9 -> '优'
        8 -> '良'
        7, 6 -> '中'
        else -> '差'
    }
    println("Grade = " + grade)

    val level = "优"    //设定一个数值用来测试
    val desc = when (level) {
        "优" -> "90分以上"
        "良" -> "80分~90分"
        "中" -> "70分~80分"
        "差" -> "低于60分"
        else -> "无法判断"
    }
    println("说明 = " + desc)
}