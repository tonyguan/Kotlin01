/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/
//代码文件：chapter6/src/com/a51work6/section3/ch6.3.1.kt
package com.a51work6.section3

fun main(args: Array<String>) {

    //-----------------------------------
    // 字符串长度length和字符串缓冲区容量capacity
    val sbuilder1 = StringBuilder()
    println("字符串长度：" + sbuilder1.length)
    println("字符串容量：" + sbuilder1.capacity())

    val sbuilder2 = StringBuilder("Hello")
    println("字符串长度：" + sbuilder2.length)
    println("字符串容量：" + sbuilder2.capacity())

    // 字符串缓冲区初始容量是16，超过之后会扩容
    val sbuilder3 = StringBuilder()
    for (i in 0..16) {
        sbuilder3.append(8)
    }
    println("字符串长度：" + sbuilder3.length)
    println("字符串容量：" + sbuilder3.capacity())

}