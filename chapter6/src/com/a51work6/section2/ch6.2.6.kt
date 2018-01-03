/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/
//代码文件：chapter6/src/com/a51work6/section2/ch6.2.6.kt
package com.a51work6.section2

fun main(args: Array<String>) {

    val sourceStr = "There is a string accessing example."
    // 截取example.子字符串
    val subStr1 = sourceStr.substring(28)
    // 截取string子字符串
    val subStr2 = sourceStr.substring(11, 17)
    // 参数是区间
    val subStr3 = sourceStr.substring(11..17)

    println(subStr1)
    println(subStr2)
    println(subStr3)

}