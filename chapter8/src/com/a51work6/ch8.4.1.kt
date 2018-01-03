/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/
//代码文件：chapter8/src/com/a51work6/ch8.4.1.kt
package com.a51work6

fun main(args: Array<String>) {

    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    for (i in numbers.indices) {
        if (i == 3) {
            break// 跳出循环
        }
        println("Count is: " + i)
    }

    label1@ for (x in 0..4) {
        for (y in 5 downTo 1) {
            if (y == x) {
                break@label1// 跳转到label1指向的外循环
            }
            println("(x,y) = ($x,$y)")
        }
    }
    println("Game Over!")

}