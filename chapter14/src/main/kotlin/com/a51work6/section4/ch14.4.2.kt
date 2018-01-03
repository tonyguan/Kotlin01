/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/
//代码文件：chapter14/src/com/a51work6/section4/ch14.4.2.kt
package com.a51work6.section4

import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.runBlocking
import kotlinx.coroutines.experimental.withTimeout

suspend fun run(name: String) {
    //启动一个协程
    for (i in 0..9) {
        // 打印协程执行次数
        println("子协程${name}执行第${i}次")
        // 随机生成挂起时间
        val sleepTime = (1000 * Math.random()).toLong()
        // 协程挂起
        delay(sleepTime)
    }
    println("子协程${name}执行结束。")
}

fun main(args: Array<String>) = runBlocking<Unit> {
    //启动一个协程1
    withTimeout(2000L) {
        run("job1")
    }
    println("主协程结束。")
}