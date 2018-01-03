/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/
//Kotlin代码文件：chapter15/src/main/kotlin/com/a51work6/section2/ch15.2.3.kt
package com.a51work6.section2

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

fun main(args: Array<String>) {

    try {
        InputStreamReader(System.`in`).use { ir ->
            BufferedReader(ir).use { reader ->
                // 从键盘接收了一个字符串的输入
                val command = reader.readLine()
                println(command)
            }
        }
    } catch (e: IOException) {
        e.printStackTrace()
    }
}