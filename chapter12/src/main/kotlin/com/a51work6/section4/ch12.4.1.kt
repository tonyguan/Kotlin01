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

import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking

//共享变量
var value = 0

fun main(args: Array<String>) = runBlocking<Unit> {

    println("主协程开始...")
    // 创建协程job1
    val job1 = launch {
        println("子协程开始...")
        for (i in 0..1) {
            println("子协程执行...")
            value++
        }
        println("子协程结束...")
    }
    // 主协程被挂起，等待job1协程结束
    ///job1.join()
    println("value = $value")
    println("主协程结束...")
}