/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/

//代码文件：chapter10/src/com/a51work6/section6/Rectangle.kt
package com.a51work6.section6

/*class Rectangle constructor(w: Int, h: Int) {
    // 矩形宽度
    var width: Int
    // 矩形高度
    var height: Int
    // 矩形面积
    var area: Int

    init {//初始化代码块
        width = w
        height = h
        area = w * h// 计算矩形面积
    }
}*/

/*
class Rectangle constructor(var width: Int, var height: Int) {
    // 矩形面积
    var area: Int

    init {//初始化代码块
        area = width * height// 计算矩形面积
    }
}*/

class Rectangle(var width: Int, var height: Int) {
    // 矩形面积
    var area: Int

    init {//初始化代码块
        area = width * height// 计算矩形面积
    }

    constructor(width: Int, height: Int, area: Int) : this(width, height) {
        this.area = area
    }

    constructor(area: Int) : this(200, 100) {//width=200 height=100
        this.area = area
    }
}