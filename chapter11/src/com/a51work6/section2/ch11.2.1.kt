/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/
//代码文件：chapter11/src/com/a51work6/section2/ch11.2.1.kt
package com.a51work6.section2

//定义计算长方形面积函数
// 函数类型(Double, Double) -> Double
fun rectangleArea(width: Double, height: Double): Double {
    return width * height
}

//定义计算三角形面积函数
//函数类型(Double, Double) -> Double
fun triangleArea(bottom: Double, height: Double) = 0.5 * bottom * height

fun sayHello() { //函数类型()->Unit
    print("Hello, World")
}

fun main(args: Array<String>) {

    val getArea: (Double, Double) -> Double = ::triangleArea
    //调用函数
    val area = getArea(50.0, 40.0)
    print(area)//1000.0
}
