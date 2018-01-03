/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/
//代码文件：chapter13/src/com/a51work6/section9/ch13.9.kt
package com.a51work6.section9

//计算水仙花
fun main(args: Array<String>) {

    val numbers = IntArray(1000) { it }//初始化0~999共计1000个元素Int数组

    numbers.filter { it > 99 }  //过滤第一次
            .filter {           //过滤第二次
                val r = it / 100  //百位数
                val s = (it - r * 100) / 10//十位数
                val t = it - r * 100 - s * 10//个位数

                it == r * r * r + s * s * s + t * t * t
            }.forEach { println(it) }//遍历打印输出
}
