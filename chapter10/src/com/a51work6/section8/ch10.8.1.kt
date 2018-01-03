/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/

//代码文件：chapter10/src/com/a51work6/section8/ch10.8.1.kt
package com.a51work6.section8

fun main(args: Array<String>) {
    //创建User对象
    val user1 = User("Tony", "123")
    val user2 = User("Tony", "123")

    println(user1 == user2)   //true
    println(user1.toString()) //User(name=Tony, password=123)
    println(user2.toString()) //User(name=Tony, password=123)

    println(user1.hashCode())  //81040716
    println(user2.hashCode())  //81040716
}