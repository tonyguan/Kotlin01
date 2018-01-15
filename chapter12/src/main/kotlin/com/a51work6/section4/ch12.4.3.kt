/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/
//代码文件：chapter12/src/com/a51work6/section4/ch12.4.3.kt
package com.a51work6.section4

import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking

fun main(args: Array<String>) = runBlocking<Unit> {
    // 创建协程
    val job = launch {
        // 一直循环，直到满足条件在取消协程
        while (true) {
            // 协程开始工作
            // TODO
            println("下载中...")
            delay(10000L)
        }
    }

    val command = readLine()// 读取从键盘的字符串
    if (command == "exit") {
        job.cancel()//取消协程
        job.join()//等待协程结束
        //job.cancelAndJoin()//取消协程并等待协程job结束
    }
}

