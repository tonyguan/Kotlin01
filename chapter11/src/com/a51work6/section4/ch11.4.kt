/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/
//代码文件：chapter11/src/com/a51work6/section4/ch11.4.kt
package com.a51work6.section4

fun makeArray(): (Int) -> Int {

    var ary = 0

//    //局部函数捕获变量
//    fun add(element: Int): Int {
//        ary += element
//        return ary
//    }
//
//    return ::add

//Lambda表达式形式捕获变量
//    return { element ->
//        ary += element
//        ary
//    }

//匿名函数形式捕获变量
    return fun(element: Int): Int {
        ary += element
        return ary
    }
}

fun main(args: Array<String>) {
    val f1 = makeArray()
    println("---f1---")
    println(f1(10))//累加ary变量，输出结果是10
    println(f1(20))//累加ary变量，输出结果是30
    println(f1(30))//累加ary变量，输出结果是60
}