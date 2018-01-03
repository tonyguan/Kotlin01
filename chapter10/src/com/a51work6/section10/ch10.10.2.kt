/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/

//代码文件：chapter10/src/com/a51work6/section10/ch10.10.2.kt
package com.a51work6.section10

//外部类
class Outer {

    // 外部类属性
    val x = 10

    // 外部类函数
    fun printOuter() {
        println("调用外部函数...")
    }

    // 测试调用内部类
    fun test() {
        val inner = Inner()
        inner.display()
    }

    // 内部类
     inner class Inner {

        // 内部类属性
        private val x = 5

        // 内部类函数
        fun display() {
            // 访问外部类的属性x
            println("外部类属性 x = " + this@Outer.x)
            // 访问内部类的属性x
            println("内部类属性 x = " + this.x)
            println("内部类属性 x = " + x)

            // 调用外部类的成员函数
            this@Outer.printOuter()
            printOuter()
        }
    }
}

fun main(args: Array<String>) {

    // 通过外部类访问内部类
    val outer = Outer()
    outer.test()

    // 直接访问内部类
    val inner = Outer().Inner()
    inner.display()

}