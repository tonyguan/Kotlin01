/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/
//代码文件：chapter9/src/com/a51work6/section3/ch9.3.2.kt
package com.a51work6.section3

fun makeCoffee(type: String = "卡布奇诺"): String {
    return "制作一杯${type}咖啡。"
}
//重载函数
//fun makeCoffee(): String {
//    return "制作一杯咖啡。"
//}

fun main(args: Array<String>) {

    val coffee1 = makeCoffee("拿铁")
    val coffee2 = makeCoffee()

    println(coffee1)//制作一杯拿铁咖啡。
    println(coffee2)//制作一杯卡布奇诺咖啡。
}