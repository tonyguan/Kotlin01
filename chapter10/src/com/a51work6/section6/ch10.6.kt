/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/
//代码文件：chapter10/src/com/a51work6/section6/ch10.6.kt
package com.a51work6.section6

fun main(args: Array<String>) {

    //创建Rectangle对象
    val rect1 = Rectangle(100, 90)
    val rect2 = Rectangle(10, 9, 900)
    val rect3 = Rectangle(20000)
    println("绘制${rect3.width}X${rect3.height}矩形面积是${rect3.area}")

    //创建Animal对象
    val animal1 = Animal()
    val animal2 = Animal(10)
    val animal3 = Animal(sex = true)
    val animal4 = Animal(10, true)

    //创建User对象
    val user = User()


}