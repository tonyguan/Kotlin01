/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/

//代码文件：chapter10/src/com/a51work6/section4/s6/ch10.4.6.kt
package com.a51work6.section4.s6

fun main(args: Array<String>) {

    val dept = Department()
    dept.no = 20
    dept.name = "技术部" //<无> -> 技术部
    dept.name = "市场部" //技术部 -> 市场部

}