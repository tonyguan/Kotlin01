/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/
//代码文件：chapter9/src/com/a51work6/section7/ch9.7.4.kt
package com.a51work6.section7

//高阶函数，funcName参数是函数类型
fun getAreaByFunc(funcName: (Double, Double) -> Double, a: Double, b: Double): Double {
    return funcName(a, b)
}

fun main(args: Array<String>) {
    //获得计算三角形面积函数
    var result: Double = getAreaByFunc(::triangleArea, 10.0, 15.0)
    println("底10 高15，计算三角形面积：$result")

    //获得计算长方形面积函数
    result = getAreaByFunc(::rectangleArea, 10.0, 15.0)
    println("宽10 高15，计算长方形面积：$result")
}