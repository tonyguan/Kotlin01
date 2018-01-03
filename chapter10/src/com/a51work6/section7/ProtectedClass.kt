/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/

//代码文件：chapter10/src/com/a51work6/section7/ProtectedClass.kt
package com.a51work6.section7

open class ProtectedClass {

    protected var x: Int = 0

    init {
        x = 100
    }

    protected fun printX() {
        println("Value Of x is " + x)
    }
}
