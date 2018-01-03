/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/
//代码文件：chapter6/src/com/a51work6/section4/ch6.4.5.kt
package com.a51work6.section4

fun main(args: Array<String>) {

    val string = "AB12CD34EF"

    val regex = Regex("""\d+""")

    val result = regex.split(string)
    println(result) //[AB, CD, EF]

}