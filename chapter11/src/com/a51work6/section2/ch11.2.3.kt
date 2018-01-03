/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/
//代码文件：chapter11/src/com/a51work6/section2/ch11.2.3.kt
package com.a51work6.section2

fun getArea(type: String): (Double, Double) -> Double {

    var returnFunction: (Double, Double) -> Double

    when (type) {
        "rect" ->   //rect 表示长方形
            returnFunction = ::rectangleArea
        else ->  //tria 表示三角形
            returnFunction = ::triangleArea
    }

    return returnFunction
}

fun main(args: Array<String>) {

    //获得计算三角形面积函数
    var area: (Double, Double) -> Double = getArea("tria")
    println("底10 高13，计算三角形面积：${area(10.0, 15.0)}")

    //获得计算长方形面积函数
    area = getArea("rect")
    println("宽10 高15，计算长方形面积：${area(10.0, 15.0)}")
}