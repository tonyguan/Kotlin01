/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/
//代码文件：chapter10/src/com/a51work6/section3/Animal.kt
package com.a51work6.section3

class Animal {

    // 动物年龄
    var age = 1
    // 动物性别
    var sex = false
    // 动物体重
    private val weight = 0.0

    private fun eat() {
        // 函数体
    }

    fun run(): Int {
        // 函数体
        return 10
    }

    fun getMaxNumber(n1: Int, n2: Int) = if (n1 > n2) n1 else n2

}
