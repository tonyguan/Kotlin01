/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/
//代码文件：chapter13/src/com/a51work6/section3/ch13.3.1.kt
package com.a51work6.section3

import com.a51work6.users

//filter函数示例1
fun main(args: Array<String>) {
    users.filter { it.name.startsWith("t", ignoreCase = true) }
            .forEach { println(it.password) }
}
