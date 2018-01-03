/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/

//代码文件：chapter5/src/com/a51work6/ch5.3.1.kt
package com.a51work6

fun main(args: Array<String>) {

    // 声明整数常量
    val byteNum: Byte = 16
    //val shortNum: Short = byteNum //编译错误
    val shortNum: Short = byteNum.toShort()// Byte类型转换为Short类型
    var intNum = 16

    val longNum: Long = intNum.toLong()// Int类型转换为Long类型
    intNum = longNum.toInt()    // Long类型转换为Int类型

    val doubleNum = 10.8
    println("doubleNum.toInt : " + doubleNum.toInt())// Double类型转换为Int类型，结果是10
    // 声明Char常量
    val charNum = 'A'
    println("charNum.toInt : " + charNum.toInt())// Char类型转换为Int类型，结果是65

    //精度丢失问题
    val llongNum = 6666666666L
    println("llongNum : " + llongNum)
    println("llongNum.toInt : " + llongNum.toInt())//结果是-1923267926，精度丢失

}
