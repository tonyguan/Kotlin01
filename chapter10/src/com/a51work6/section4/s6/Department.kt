/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/

//代码文件：chapter10/src/com/a51work6/section4/s6/Department.kt
package com.a51work6.section4.s6

import kotlin.properties.Delegates

// 部门类
class Department {
    var no: Int = 0            // 部门编号属性
    var name: String by Delegates.observable("<无>") { p, oldValue, newValue ->

        println("$oldValue -> $newValue")
    }
}