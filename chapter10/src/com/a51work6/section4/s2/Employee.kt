/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/
//代码文件：chapter10/src/com/a51work6/section4/s2/Employee.kt
package com.a51work6.section4.s2

// 员工类
class Employee {

    var no: Int = 0             // 员工编号属性
    var job: String? = null     // 工作属性
    var firstName: String = "Tony"
    var lastName: String = "Guan"
    var fullName: String       //全名
            //get() = firstName + "." + lastName
        get() {
            return firstName + "." + lastName
        }
        set (value) {
            val name = value.split(".")
            firstName = name[0]
            lastName = name[1]
        }

    var salary: Double = 0.0    // 薪资属性
        set(value) {
            if (value >= 0.0) field = value
        }
}
