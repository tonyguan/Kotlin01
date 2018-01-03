/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/
//代码文件：chapter12/src/com/a51work6/section4/ch12.4.1.kt
package com.a51work6.section4

fun main(args: Array<String>) {

    val list1 = listOf("ABC")     //[ABC]
    val list2 = listOf<Long?>()   //[]
    val list3 = listOf(3, 75, 54, 75)//[3, 75, 54, 75]
    val list4 = list3.subList(1, 3)//[75, 54]

    println(list1.size)       //1
    println(list2.isEmpty())  //true
    println(list3.contains(54)) //true
    println(list3.indexOf(75)) //1
    println(list3.lastIndexOf(75)) //3
    //通过下标访问
    println(list3[1])   //75
    // 1.使用for循环遍历
    println("--1.使用for循环遍历--")
    for (item in list3) {
        println("读取集合元素: $item")
    }

    // 2.使用迭代器遍历
    println("--2.使用迭代器遍历--")
    val it = list3.iterator()
    while (it.hasNext()) {
        val item = it.next()
        println("读取集合元素: $item")
    }
}
