/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/
//代码文件：chapter12/src/com/a51work6/section4/ch12.2.6.kt
package com.a51work6.section2

import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking
import java.lang.Math.random

abstract class SuperClass {
    suspend abstract fun run()
}

class SubClass : SuperClass() {
    override suspend fun run() {}
}

suspend fun run(name: String) {
    //启动一个协程
    for (i in 0..9) {
        // 打印协程执行次数
        println("子协程${name}执行第${i}次")
        // 随机生成挂起时间
        val sleepTime = (1000 * random()).toLong()
        // 协程挂起
        delay(sleepTime)
    }
    println("子协程${name}执行结束。")
}

fun main(args: Array<String>) = runBlocking<Unit> {
    //启动一个协程1
    val job1 = launch() {
        run("job1")
    }
    //启动一个协程2
    val job2 = launch {
        run("job2")
    }
    delay(10000L) // 主协程挂起
    println("主协程结束。")
}