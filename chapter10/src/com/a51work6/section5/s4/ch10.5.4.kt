/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/

//代码文件：chapter10/src/com/a51work6/section5/s4/ch10.5.4.kt
package com.a51work6.section5.s4

//定义中缀函数interestBy
infix fun Double.interestBy(interestRate: Double): Double {
    return this * interestRate
}

// 部门类
class Department {
    var no: Int = 10      // 部门编号属性

    //定义中缀函数rp
    infix fun rp(times: Int) {
        repeat(times) {
            println(no)
        }
    }
}

fun main(args: Array<String>) {

    //函数调用
    val interest1 = 10_000.00.interestBy(0.0668)
    println("利息1: $interest1")

    //中缀运算符interestBy
    val interest2 = 10_000.00 interestBy 0.0668
    println("利息1: $interest2")

    val dept = Department()
    dept rp 3 //中缀运算符rp
}