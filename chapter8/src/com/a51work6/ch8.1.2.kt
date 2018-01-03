/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/

//代码文件：chapter8/src/com/a51work6/ch8.1.2.kt
package com.a51work6

fun main(args: Array<String>) {

    val score = 95

    // 1. if-else结构
    val result1 = if (score < 60) {
        println("不及格")
    } else {
        println("及格")
    }

    val result2 = if (score < 60) {
        println("不及格")
        //TODO
        "重新考试"
    } else {
        println("及格")
        //TODO
        "通过考试"
    }

    // 2. else-if结构
    val testScore = 76
    val grade: Char = if (testScore >= 90)
        'A'
    else if (testScore >= 80)
        'B'
    else if (testScore >= 70)
        'C'
    else if (testScore >= 60)
        'D'
    else
        'F'

    println("Grade = " + grade)
}