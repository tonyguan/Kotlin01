/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/
//代码文件：chapter15/src/main/kotlin/com/a51work6/section3/s3/ch15.3.3.kt
@file:JvmName("StaticFieldDemo")

package com.a51work6.section3.s3

import java.util.*

object Singleton {  //Singleton声明对象
    @JvmField
    val x = 10
    lateinit var birthDate: Date

    @JvmStatic
    fun displayX() {
        println(x)
    }
}

class Account {
    companion object {//Account伴生对象
        const val interestRate = 0.018
        @JvmStatic
        fun interestBy(amt: Double): Double {
            return interestRate * amt
        }
    }
}

const val MAX_COUNT = 500