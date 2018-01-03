/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/

//代码文件：chapter10/src/com/a51work6/section9/WeekDays.kt
package com.a51work6.section9

//最简单形式的枚举类
/*enum class WeekDays {
    // 枚举常量列表
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
}*/

//枚举类构造函数
enum class WeekDays(private val wname: String,
                    private val index: Int) {
    // 枚举常量列表
    MONDAY("星期一", 0), TUESDAY("星期二", 1), WEDNESDAY("星期三", 2), THURSDAY("星期四", 3), FRIDAY("星期五", 4);

    // 重写父类中的toString()函数
    override fun toString(): String {
        return "$wname-$index"
    }
}

