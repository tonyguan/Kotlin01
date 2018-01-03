/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/

//代码文件：chapter10/src/com/a51work6/section4/s5/ch10.4.5.kt
package com.a51work6.section4.s5

fun main(args: Array<String>) {

    val emp = Employee()
    println(emp.fullName)//Tony.Guan

    val dept = Department()
    dept.no = 20

    emp.dept = dept
    println(emp.dept)
}