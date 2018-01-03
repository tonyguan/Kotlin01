/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/
//代码文件：chapter6/src/com/a51work6/section2/ch6.2.4.kt
package com.a51work6.section2

fun main(args: Array<String>) {

    val sourceStr = "There is a string accessing example."

    val len = sourceStr.length //获得字符串长度
    val ch = sourceStr[16]  //获得索引位置16的字符

    //查找字符和子字符串
    val firstChar1 = sourceStr.indexOf('r')
    val lastChar1 = sourceStr.lastIndexOf('r',ignoreCase = true)
    val firstStr1 = sourceStr.indexOf("ing")
    val lastStr1 = sourceStr.lastIndexOf("ing")
    val firstChar2 = sourceStr.indexOf('e', 15)
    val lastChar2 = sourceStr.lastIndexOf('e', 15)
    val firstStr2 = sourceStr.indexOf("ing", 5)
    val lastStr2 = sourceStr.lastIndexOf("ing", 5)

    println("原始字符串:" + sourceStr)
    println("字符串长度:" + len)
    println("索引16的字符:" + ch)
    println("从前往后查找r字符，第一次找到它所在索引:" + firstChar1)
    println("从后往前查找r字符，第一次找到它所在索引:" + lastChar1)
    println("从前往后查找ing字符串，第一次找到它所在索引:" + firstStr1)
    println("从后往前查找ing字符串，第一次找到它所在索引:" + lastStr1)
    println("从索引为15位置开始，从前往后查找e字符，第一次找到它所在索引:" + firstChar2)
    println("从索引为15位置开始，从后往前查找e字符，第一次找到它所在索引:" + lastChar2)
    println("从索引为5位置开始，从前往后查找ing字符串，第一次找到它所在索引:" + firstStr2)
    println("从索引为5位置开始，从后往前查找ing字符串，第一次找到它所在索引:" + lastStr2)

}