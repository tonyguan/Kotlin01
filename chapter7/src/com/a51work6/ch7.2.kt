/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/
//代码文件：chapter7/src/com/a51work6/ch7.2.kt
package com.a51work6

fun main(args: Array<String>) {

    val value1 = 1
    val value2 = 2
    println(value1 == value2)         //输出结果为false
    println(value1.toDouble() == 1.0) //输出结果为true
    println(value1 != value2)         //输出结果为true
    println(value1 > value2)          //输出结果为false
    println(value1 < value2)          //输出结果为true
    println(value1 <= value2)         //输出结果为true

    val p1 = Person("Tony", 18)
    val p2 = Person("Tony", 18)
    val p3 = Person("Tom", 20)
    val p4 = p3

    println(p1 == p2)         //输出结果为true
    println(p1 == p3)         //输出结果为false
    println(p3 === p4)        //输出结果为true

}