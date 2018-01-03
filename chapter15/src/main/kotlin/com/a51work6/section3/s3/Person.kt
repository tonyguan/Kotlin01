/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/
//Kotlin代码文件：chapter15/src/main/kotlin/com/a51work6/section3/s3/Person.kt
package com.a51work6.section3.s3

import java.util.*

class Person {
    // 名字
    @JvmField
    var name = "Tony"
    // 年龄
    var age = 18
    // 出生日期
    lateinit var birthDate: Date
}
