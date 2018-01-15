/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/
//Kotlin代码文件：chapter13/src/main/kotlin/com/a51work6/section2/ch13.2.2.kt
package com.a51work6.section2

import java.util.*

fun main(args: Array<String>) {
    val person = Person()
    val date = person.birthDate
    println("date = $date")//null
    val date1: Date? = person.birthDate
    println("date1 = $date1")//null
    val date2: Date = person.birthDate//抛出异常
    println("date2 = $date2")
}