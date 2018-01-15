/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/
//代码文件：chapter12/src/main/kotlin/com/a51work6/section2/ch12.2.3.kt
package com.a51work6.section2

import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import java.lang.Math.random
import java.lang.Thread.sleep

fun main(args: Array<String>) {
    launch {
        //启动一个协程
        for (i in 0..9) {
            // 打印协程执行次数
            println("子协程执行第${i}次")
            // 随机生成挂起时间
            val sleepTime = (1000 * random()).toLong()
            // 协程挂起
            delay(sleepTime)
        }
        println("子协程执行结束。")
    }
    sleep(10000L) // 主线程休眠，保持其他线程处于活动状态
    println("主协程结束。")

}