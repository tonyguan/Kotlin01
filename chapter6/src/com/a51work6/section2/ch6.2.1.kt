/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/
//代码文件：chapter6/src/com/a51work6/section2/ch6.2.1.kt
package com.a51work6.section2

fun main(args: Array<String>) {

    val chars = charArrayOf('a', 'b', 'c', 'd', 'e')  //创建字符数组

    val s1 = String(chars)                      // 通过字符数组获得字符串对象
    val s2 = String(chars, 1, 4) // 通过子字符数组获得字符串对象
    println("s1 = " + s1)  //输出结果s1 = abcde
    println("s2 = " + s2)  //输出结果s2 = bcde

    val bytes = byteArrayOf(97, 98, 99)     //创建字节数组
    val s3 = String(bytes)                      // 通过字节数组获得字符串对象
    val s4 = String(bytes, 1, 2) // 通过子字节数组获得字符串对象
    println("s3 = " + s3)   //输出结果s3 = abc
    println("s4 = " + s4)   //输出结果s4 = bc

}