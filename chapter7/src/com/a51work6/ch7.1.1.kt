/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/

//代码文件：chapter7/src/com/a51work6/ch7.1.1.kt
package com.a51work6

fun main(args: Array<String>) {
    var a = 12
    println(-a)    //a取反，结果输出是-12
    var b = a++
    println(b)      //结果输出是12
    b = ++a
    println(b)      //结果输出是14
}