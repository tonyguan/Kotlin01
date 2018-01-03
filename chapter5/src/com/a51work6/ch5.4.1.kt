/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/

//代码文件：chapter5/src/com/a51work6/ch5.4.1.kt
//介绍可空类型
package com.a51work6

fun main(args: Array<String>) {

//    var n: Int = 10  //声明Int类型变量
//    n = null      //不能接收空值（null）

    var n: Int? = 10  //声明Int?（Int可空）类型变量
    println(n)
    n = null          //可以接收空值（null）
    println(n)
}
