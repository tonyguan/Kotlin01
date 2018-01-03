/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/
//代码文件：chapter5/src/com/a51work6/ch5.4.4.kt
//使用Elvis运算符（?:）
package com.a51work6

fun main(args: Array<String>) {

    val divNumber1 = divide(100, 0)
    val result1 = divNumber1?.plus(100) ?: 0//divNumber1+100，结果0
    println(result1)

    val divNumber2 = divide(100, 10)
    val result2 = divNumber2?.plus(100) ?: 0//divNumber2+100，结果110.0
    println(result2)
}