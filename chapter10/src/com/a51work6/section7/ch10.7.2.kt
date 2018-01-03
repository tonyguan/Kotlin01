/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/
//代码文件：chapter10/src/com/a51work6/section7/ch10.7.2.kt
package com.a51work6.section7

import com.a51work6.Person
import java.util.*

fun main(args: Array<String>) {
    val now = Date()
    val person = Person("Tony", now, 18)
    println(person.name)
    //println(person.age) //不能访问age属性
    //println(person.birthDate)//不能访问birthDate属性
    //person.display()//不能访问display()函数
}
