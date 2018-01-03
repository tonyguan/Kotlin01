/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/
//Kotlin代码文件：chapter15/src/main/kotlin/com/a51work6/section2/ch15.2.4.kt
package com.a51work6.section2

fun main(args: Array<String>) {

    val n1 = 10
    val n2 = 5

    // 实现加法计算Calculable对象
    val f1 = Calculable { a, b -> a + b }
    // 实现减法计算Calculable对象
    val f2 = Calculable { a, b -> a - b }

    // 调用calculateInt函数进行加法计算
    println("$n1 + $n2 = ${f1.calculateInt(n1, n2)}")
    // 调用calculateInt函数进行减法计算
    println("$n1 - $n2 = ${f2.calculateInt(n1, n2)}")
    
}
