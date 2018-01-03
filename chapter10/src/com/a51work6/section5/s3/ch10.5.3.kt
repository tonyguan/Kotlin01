/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/

//代码文件：chapter10/src/com/a51work6/section5/s3/ch10.5.3.kt
package com.a51work6.section5.s3

// 部门类
class Department {
    var no: Int = 0        // 部门编号属性
    var name: String = ""  // 部门名称属性
    var desc: String = "成员：${no} - ${name}"  // 描述属性

    fun display(): String {
        return "成员: [no=${this.no}, name=${this.name}]"
    }
}

val Department.desc: String
    get() {
        return "扩展: [no=${this.no}, name=${this.name}]"
    }

fun Department.display(): String {
    return "扩展: [no=${this.no}, name=${this.name}]"
}

fun Department.display(f: String): String {
    return "扩展: $f, [no=${this.no}, name=${this.name}] "
}


fun main(args: Array<String>) {

    val dept = Department()
    dept.name = "智捷课堂"
    dept.no = 100

    println(dept.desc)
    println(dept.display())
    println(dept.display("My"))

}