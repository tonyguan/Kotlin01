/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/

//代码文件：chapter10/src/com/a51work6/section4/s6/ch10.4.6.kt
package com.a51work6.section4.s5

// 员工类
open class Employee {

    var no: Int = 0             // 员工编号属性
    var firstName: String = "Tony"
    var lastName: String = "Guan"

    val fullName: String by lazy {
        firstName + "." + lastName
    }

    lateinit var dept: Department

}

// 部门类
class Department {
    var no: Int = 0            // 部门编号属性
    var name: String = ""     // 部门名称属性
}