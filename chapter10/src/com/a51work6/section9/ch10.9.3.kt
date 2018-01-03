/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/

//代码文件：chapter10/src/com/a51work6/section9/ch10.9.3.kt
package com.a51work6.section9

fun main(args: Array<String>) {

    // 返回一个包含全部枚举常量的数组
    val allValues = WeekDays.values()
    // 遍历枚举常量数值
    for (value in allValues) {
        println("${value.ordinal} - $value")
    }

    // 创建WeekDays对象
    val day1 = WeekDays.FRIDAY
    val day2 = WeekDays.valueOf("FRIDAY")

    println(day1 === WeekDays.FRIDAY)//true
    println(day1 == WeekDays.FRIDAY)//true
    println(day1 === day2)//true

}