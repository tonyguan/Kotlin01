/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/
//代码文件：chapter6/src/com/a51work6/section4/ch6.4.1.kt
package com.a51work6.section4

fun main(args: Array<String>) {

    //全部是数字模式
    val regex = Regex("""\d+""")

    val input1 = "1000"
    val input2 = "￥1000"

    println(regex.matches(input1))//true
    println(regex.matches(input2))//false

    println(regex.containsMatchIn(input1))//true
    println(regex.containsMatchIn(input2))//true

}