/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/
//代码文件：chapter9/src/com/a51work6/section10/ch9.10.1.kt
package com.a51work6.section10

//内联函数
inline fun calculatePrint(funN: (Int, Int) -> Int) {
    println("${funN(10, 5)}")
}

fun main(args: Array<String>) {
    calculatePrint { a, b -> a + b }
    calculatePrint { a, b -> a - b }
}
