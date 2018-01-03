/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/
//代码文件：chapter6/src/com/a51work6/section3/ch6.3.2.kt
package com.a51work6.section3

fun main(args: Array<String>) {

    //添加字符串、字符
    val sbuilder1 = StringBuilder("Hello")
    sbuilder1.append(" ").append("World")
    sbuilder1.append('.')
    println(sbuilder1)

    val sbuilder2 = StringBuilder()
    val obj: Any? = null
    //添加布尔值、转义符和空对象
    sbuilder2.append(false).append('\t').append(obj)
    println(sbuilder2)

    //添加数值
    val sbuilder3 = StringBuilder()
    for (i in 0..9) {
        sbuilder3.append(i)
    }
    println(sbuilder3)
    // 插入字符串
    sbuilder3.insert(4, "Kotlin")
    println(sbuilder3)

    // 删除字符串
    sbuilder3.delete(1, 2)//删除"1"字符
    println(sbuilder3)

    // 替换字符串
    sbuilder3.replace(3, 9, "A")//"A"替换"Kotlin"
    println(sbuilder3)
}