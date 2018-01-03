/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/
//代码文件：chapter8/src/com/a51work6/ch8.3.3.kt
package com.a51work6

fun main(args: Array<String>) {

    for (num in 1..9) { //使用区间运算符
        println("$num x $num = ${num * num}")
    }

    // 声明并初始化Int数组
    val numbers = intArrayOf(43, 32, 53, 54, 75, 7, 10)
    // for语句
    for (item in numbers) {
        println("Count is:$item")
    }
    for (i in numbers.indices) { //获取数组索引
        println("numbers[$i] = ${numbers[i]}")
    }
}