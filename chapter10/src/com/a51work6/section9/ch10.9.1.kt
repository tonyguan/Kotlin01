/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/

//代码文件：chapter10/src/com/a51work6/section9/ch10.9.1.kt
package com.a51work6.section9

fun main(args: Array<String>) {
    // day工作日变量
    val day = WeekDays.FRIDAY
    println(day)
    when (day) {
        WeekDays.MONDAY -> println("星期一")
        WeekDays.TUESDAY -> println("星期二")
        WeekDays.WEDNESDAY -> println("星期三")
        WeekDays.THURSDAY -> println("星期四")
        else //case FRIDAY:
        -> println("星期五")
    }
}