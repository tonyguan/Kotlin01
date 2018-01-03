/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/

//代码文件：chapter10/module1/src/com/a51work6/ch10.7.3.kt
package com.a51work6

import java.util.*

fun main(args: Array<String>) {
    val now = Date()
    val person = Person("Tony", now, 18)
    println(person.name)
    println(person.age)
    // println(person.birthDate)//不能访问birthDate属性
    person.display()

}
