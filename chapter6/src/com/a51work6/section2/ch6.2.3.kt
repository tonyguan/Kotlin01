/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/
//代码文件：chapter6/src/com/a51work6/section2/ch6.2.3.kt
package com.a51work6.section2

fun main(args: Array<String>) {

    val age = 18
    val s1 = "她的年龄是${age}岁。" //使用表达式形式模板
    println(s1)//她的年龄是18岁。

    val score = 'A'
    val s2 = "她的英语成绩是$score" //使用变量形式模板
    println(s2)//她的英语成绩是A

    val now = java.util.Date()
    val s3 = "今天是：${now.year + 1900}年${now.month}月${now.day}日"
    println(s3)

    val s4 = """今天是：
	${now.year + 1900}年
	${now.month}月
	${now.day}日"""//在原始字符串中使用字符串模板
    println(s4)

}