/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/
//代码文件：chapter12/src/com/a51work6/section1/ch12.1.2.kt
package com.a51work6.section1

fun main(args: Array<String>) {

    // 静态初始化
    val array1 = shortArrayOf(20, 10, 50, 40, 30)
    // 动态初始化
    val array2 = CharArray(3)
    println(array2[0] == '\u0000')
    array2[0] = 'C'
    array2[1] = 'B'
    array2[2] = 'D'
    // 动态初始化
    val array3 = IntArray(10) { it * it }

    //遍历集合
    for (item in array3) {
        println(item)
    }
    println()
    for (idx in array2.indices) {
        println(array2[idx])
    }
}
