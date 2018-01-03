/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/
//代码文件：chapter13/src/com/a51work6/section3/User.kt
package com.a51work6

data class User(val name: String, var password: String)

//测试使用
val users = listOf<User>(
        User("Tony", "12%^3"),
        User("Tom", "23##4"),
        User("Ben", "1332%#4"),
        User("Alex", "ac133")
)