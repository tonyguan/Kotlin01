/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/
//代码文件：chapter4/src/ch4.2.2.kt
const val MAX_COUNT = 1000             //声明顶层常量

const val _Hello1 = "Hello，world"   //声明顶层常量
//const val _Hello2 = StringBuilder("HelloWorld")    //编译错误

//声明对象
object UserDAO {
    const val MAX_COUNT = 100//声明对象中的声明常量
}

public fun main(args: Array<String>) {
    //_Hello1 = "Hello, World"   //编译错误
    val scoreForStudent: Float = 0.0f
    val y = 20
    //y = 30 //编译错误
    //const val x = 10          //编译错误
}