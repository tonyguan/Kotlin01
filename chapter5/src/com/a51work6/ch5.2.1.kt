/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/

//代码文件：chapter5/src/com/a51work6/ch5.2.1.kt
package com.a51work6

fun main(args: Array<String>) {
    // 声明整数变量
    // 输出一个默认整数常量
    println("默认整数常量 =  " + 16)
    val a: Byte = 16
    val b: Short = 16
    val c = 16
    val d = 16L
    println("Byte整数     =  " + a)
    println("Short整数    =  " + b)
    println("Int整数      =  " + c)
    println("Long整数     =  " + d)

    //数字常量添加下划线，增强可读性
    val e = 160_000_000L  //表示160000000数字
    println("数字常量添加下划线   =  " + e)

    // 进制表示方式
    val decimalInt = 28         //十进制表示
    val binaryInt1 = 0b11100    //二进制表示
    val binaryInt2 = 0B11100    //二进制表示
    val hexadecimalInt1 = 0x1C    //十六进制表示
    val hexadecimalInt2 = 0X1C    //十六进制表示
}
