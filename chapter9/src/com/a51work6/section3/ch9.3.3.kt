/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/
//代码文件：chapter9/src/com/a51work6/section2/ch9.3.3.kt
package com.a51work6.section3

fun sum(vararg numbers: Double, multiple: Int = 1): Double {
    var total = 0.0
    for (number in numbers) {
        total += number
    }
    return total * multiple
}

fun main(args: Array<String>) {
    println(sum(100.0, 20.0, 30.0))    //输出150.0
    println(sum(30.0, 80.0))        //输出110.0
    println(sum(30.0, 80.0, multiple = 2))   //输出220.0

    val doubleAry = doubleArrayOf(50.0, 60.0, 0.0)
    println(sum(30.0, 80.0, *doubleAry)) //输出220.0
}
