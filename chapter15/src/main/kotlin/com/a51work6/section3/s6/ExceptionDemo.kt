/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/
//代码文件：chapter15/src/main/kotlin/com/a51work6/section3/s6/ExceptionDemo.kt
package com.a51work6.section3.s6

import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

// 解析日期
@Throws(ParseException::class)
fun readDate(): Date? {
    val str = "201A-18-18" //非法格式日期
    val df = SimpleDateFormat("yyyy-MM-dd")
    // 从字符串中解析日期
    return df.parse(str)
}