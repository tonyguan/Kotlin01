/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/
//代码文件：chapter13/src/main/kotlin/com/a51work6/section3/s4/Employee.kt
package com.a51work6.section3.s4

// 员工类
internal class Employee {
    internal var no: Int = 10            // 内部可见性Java端可见
    protected var job: String? = null   // 保护可见性Java端子类继承可见

    var salary: Double = 0.0    // 私有可见性Java端不可见
        set(value) {
            if (value >= 0.0) field = value
        }
    lateinit var dept: Department  // 公有可见性Java端可见
}

// 部门类，open可以被继承
open class Department {
    protected var no: Int = 0  // 保护可见性Java端子类继承可见
    var name: String = ""      // 公有可见性Java端可见
}

internal const val MAX_COUNT = 500  // 内部可见性Java端可见
private const val MIN_COUNT = 0     // 私有可见性Java端不可见