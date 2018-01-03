/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/

//代码文件：chapter8/src/com/a51work6/ch8.2.1.kt
package com.a51work6

fun main(args: Array<String>) {

    val testScore = 75  //设定一个数值用来测试
    when (testScore / 10) {
        9 -> {
            println('优')
        }
        8 -> println('良')
        7, 6 -> println('中')
        else -> println('差')
    }

    val level = "优"    //设定一个数值用来测试
    var desc = ""    //接收返回值
    when (level) {
        "优" -> desc = "90分以上"
        "良" -> desc = "80分~90分"
        "中" -> desc = "70分~80分"
        "差" -> desc = "低于60分"
    }
    println("说明 = " + desc)

    when {//省略表达式
        testScore >= 90 -> println('优') //分支条件表达式单纯的布尔值
        else -> println('良')
    }

}