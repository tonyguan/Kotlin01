/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/

//代码文件：chapter10/src/com/a51work6/section4/s4/ch10.4.4.kt
package com.a51work6.section4.s4

import kotlin.reflect.KProperty

class User {
    var name: String by Delegate()
}

class Delegate {
    operator fun getValue(thisRef: Any, property: KProperty<*>): String = property.name

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println(value)
    }
}

fun main(args: Array<String>) {

    val user = User()
    user.name = "Tom"
    println(user.name)

}