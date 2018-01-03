/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/

//代码文件：chapter7/src/com/a51work6/ch7.1.3.kt
package com.a51work6

fun main(args: Array<String>) {

    var a = 1
    val b = 2
    a += b          // 相当于 a = a + b
    println(a)      //输出结果3

    a += b + 3      // 相当于 a = a + b + 3
    println(a)      //输出结果8
    a -= b          // 相当于 a = a - b
    println(a)      //输出结果6

    a *= b          // 相当于 a=a*b
    println(a)      //输出结果12

    a /= b          // 相当于 a=a/b
    println(a)      //输出结果6

    a %= b          // 相当于 a=a%b
    println(a)      //输出结果0
}