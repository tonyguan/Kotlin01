/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/

//代码文件：chapter10/src/com/a51work6/section7/PrivateClass.kt
package com.a51work6.section7

class PrivateClass {

    private var x: Int = 0

    private fun printX() {
        println("Value Of x is" + x)
    }

    fun display() {
        x = 100
        printX()
    }
}