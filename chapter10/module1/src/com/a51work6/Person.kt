/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/
//代码文件：chapter10/module1/src/com/a51work6/Person.kt
package com.a51work6

import java.util.*

class Person(val name: String,// 名字
                  private val birthDate: Date,// 出生日期
                  internal val age: Int)// 年龄
{
    internal fun display() {
        println("[name:$name, birthDate:$birthDate, age:$age]")
    }
}
