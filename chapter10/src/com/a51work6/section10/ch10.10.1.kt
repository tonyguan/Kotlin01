/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/

//代码文件：chapter10/src/com/a51work6/section10/ch10.10.1.kt
package com.a51work6.section10

//外部类
class View {

    // 外部类属性
    val x = 20

    // 嵌套类
    class Button {
        // 嵌套类函数
        fun onClick() {
            println("onClick...")
            //不能访问外部类的成员
            //println(x) //编译错误
        }
    }

    // 测试调用嵌套类
    fun test() {
        val button = Button()
        button.onClick()
    }
}

fun main(args: Array<String>) {

    val button = View.Button()
    button.onClick()

    // 测试调用嵌套类
    val view = View()
    view.test()
}
