/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/

//代码文件：chapter10/src/com/a51work6/section8/ch10.8.3.kt
package com.a51work6.section8

fun main(args: Array<String>) {
    //创建User对象
    val user1 = User("Tony", "123")
    //解构
    val(name1,pwd1) = user1
    println(name1)  //Tony
    println(pwd1)   //123
    val(name2,_) = user1    //省略解构password
    println(name2)  //Tony
}
