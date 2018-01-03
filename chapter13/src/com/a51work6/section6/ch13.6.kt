/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/
//代码文件：chapter13/src/com/a51work6/section6/ch13.6.kt
package com.a51work6.section6

fun main(args: Array<String>) {

    val set = setOf(1, 3, 34, 54, 75)
    val charList = listOf("A", null, "B", "C")

    println(charList.mapNotNull { it }      //[A, B, C]
            .map { it.toLowerCase() })    //[a, b, c]
    println(set.mapIndexed { index, s -> index + s })//[1, 4, 36, 57, 79]

    val datas = listOf(listOf(10, 20), listOf(20, 40))
    val flatMapList = datas.flatMap { e ->
        e.map { it * 10 }
    }
    println(flatMapList)//[100, 200, 200, 400]
}
