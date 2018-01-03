/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/
//代码文件：chapter6/src/com/a51work6/section2/ch6.2.5.kt
package com.a51work6.section2

fun main(args: Array<String>) {

    val s1 = "Hello"
    val s2 = "Hello"

    // 比较字符串内容是否相等
    println(s1.equals(s2))   //输出true
    println(s1 == s2)       //输出true

    val s3 = "HELlo"
    // 忽略大小写比较字符串内容是否相等
    println(s1.equals(s3, ignoreCase = true))  //输出true
    println(s1 == s3)       //输出false

    // 比较大小
    val s4 = "java"
    val s5 = "Kotlin"

    println(s4.compareTo(s5))    // 输出31
    println(s4.compareTo(s5, ignoreCase = true))   // 输出-1

    // 判断文件夹中文件名
    val docFolder = arrayOf("java.docx", "JavaBean.docx", "Objecitve-C.xlsx", "Swift.docx")
    var wordDocCount = 0
    // 查找文件夹中Word文档个数
    for (doc in docFolder) {
        // 比较后缀是否有.docx字符串
        if (doc.endsWith(".docx")) {
            wordDocCount++
        }
    }
    println("文件夹中Word文档个数是： " + wordDocCount)

    var javaDocCount = 0
    // 查找文件夹中Java相关文档个数
    for (doc in docFolder) {
        // 比较前缀是否有java字符串
        if (doc.startsWith("java", ignoreCase = true)) {
            javaDocCount++
        }
    }
    println("文件夹中Java相关文档个数是：" + javaDocCount)

}