/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/
//代码文件：chapter11/src/com/a51work6/section1/ch11.1.1.kt
package com.a51work6.section1

fun main(args: Array<String>) {

    // 静态初始化
    val intArray1 = arrayOf(21, 32, 43, 45)
    val strArray1 = arrayOf("张三", "李四", "王五", "董六")

    // 动态初始化
    val strArray2 = arrayOfNulls<String>(4)

    // 初始化数组中元素
    strArray2[0] = "张三"
    strArray2[1] = "李四"
    strArray2[2] = "王五"
    strArray2[3] = "董六"
    val intArray2 = Array<Int>(10) { i -> i * i }//可以使用{ it * it }替代
    val intArray3 = Array<Int?>(10) { it * it * it } //可以使用{ i -> i * i * i }替代

    //遍历集合
    for (item in intArray2) {
        println(item)
    }
    println()
    for (idx in strArray1.indices) {
        println(strArray1[idx])
    }
}
