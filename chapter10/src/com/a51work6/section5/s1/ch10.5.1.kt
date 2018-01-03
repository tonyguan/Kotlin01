/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/

//代码文件：chapter10/src/com/a51work6/section5/s1/ch10.5.1.kt
package com.a51work6.section5.s1

//基本数据类型扩展
fun Double.interestBy(interestRate: Double): Double {
    return this * interestRate
}

//自定义账户类
class Account {
    var amount: Double = 0.0    //账户金额
    var owner: String = ""      //账户名
}

//账户类函数扩展
fun Account.interestBy(interestRate: Double): Double {
    return this.amount * interestRate
}

fun main(args: Array<String>) {

    val interest1 = 10_000.00.interestBy(0.0668)
    println("利息1: $interest1")

    val account = Account()
    val interest2 = account.interestBy(0.0668)
    println("利息2: $interest2")
}