/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/
//代码文件：chapter16/src/main/kotlin/com/a51work6/section1/ch16.1.kt
package com.a51work6.section1

import kotlinx.html.*
import kotlinx.html.stream.appendHTML

fun main(args: Array<String>) {
    System.out.appendHTML().html {
        body {
            div {
                a("http://zhijieketang.com") {
                    target = ATarget.blank
                    +"智捷课堂视频网站"
                }
            }
        }
    }
}