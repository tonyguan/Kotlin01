/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/

//代码文件：chapter10/src/com/a51work6/section5/s2/ch10.5.2.kt
package com.a51work6.section5.s2

// 部门类
class Department {
    var no: Int = 0        // 部门编号属性
    var name: String = ""  // 部门名称属性
}

var Department.desc: String
    get() {
        return "Department [no=${this.no}, name=${this.name}]"
    }
    set(value) {
        println(value)
        // println(field)//编译错误
    }

val Int.errorMessage: String
    get() = when (this) {
        -7 -> "没有数据。"
        -6 -> "日期没有输入。"
        -5 -> "内容没有输入。"
        -4 -> "ID没有输入。"
        -3 -> "据访问失败。"
        -2 -> "您的账号最多能插入10条数据。"
        -1 -> "用户不存在，请到http://51work6.com注册。"
        else -> ""
    }

fun main(args: Array<String>) {

    val message = (-7).errorMessage
    println("Error Code: -7 , Error Message:  $message")

    val dept = Department()
    dept.name = "智捷课堂"
    dept.no = 100
    println(dept.desc)
}