/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/
//代码文件：chapter13/src/com/a51work6/section5/ch13.5.kt
package com.a51work6.section5

fun main(args: Array<String>) {

    val map = mapOf(102 to "张三", 105 to "李四", 109 to "王五")
    val list = intArrayOf(1, 3, 34, 54, 75)
    val charList = listOf("A", null, "B", "C")

    println(list.drop(2))               //[34, 54, 75]

    println(map.filter { it.key > 102 })    //{105=李四, 109=王五}
    println(map.filterNot { it.key > 102 }) //{102=张三}
    println(charList.filterNotNull())//[A, B, C]

    println(list.slice(listOf(0, 2)))       //[1, 34]

    println(list.take(3))       //[1, 3, 34]
    println(list.takeLast(3))   //[34, 54, 75]

    println(list.find { it > 10 })       //34
    println(list.findLast { it < -1 })   //null

    println(list.first())       //1
    println(list.last())        //75
    println(list.first { it > 10 })        //34
    println(list.firstOrNull { it > 100 }) //null
    println(list.last { it > 10 })         //75
    println(list.lastOrNull { it > 100 })  //null

}