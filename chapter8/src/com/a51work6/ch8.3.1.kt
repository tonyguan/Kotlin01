/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/

//代码文件：chapter8/src/com/a51work6/ch8.3.1.kt
package com.a51work6

fun main(args: Array<String>) {

    var i = 0
    while (i * i < 100_000) {//采用下划线分割数值可读性好
        i++
    }

    println("i = " + i)     //输出结果是i = 317
    println("i * i = " + i * i) //输出结果是i * i = 100489
}