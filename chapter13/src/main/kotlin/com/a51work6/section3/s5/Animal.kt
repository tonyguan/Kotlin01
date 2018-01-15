/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/
//代码文件：chapter13/src/main/kotlin/com/a51work6/section3/s5/Animal.kt
package com.a51work6.section3.s5

class Animal @JvmOverloads constructor(val age: Int, val sex: Boolean = false)

class DisplayOverloading {
    @JvmOverloads
    fun display(c: Char, num: Int = 1) {
        println(c + " " + num)
    }
}

@JvmOverloads
fun makeCoffee(type: String = "卡布奇诺"): String {
    return "制作一杯${type}咖啡。"
}