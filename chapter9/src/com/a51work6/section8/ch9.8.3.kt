/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/
//代码文件：chapter9/src/com/a51work6/section8/ch9.8.3.kt
package com.a51work6.section8

//------1. 参数类型推导简化--------
private fun calculate(opr: Char): (Int, Int) -> Int = when (opr) {
    '+' -> { a, b -> a + b }
    '-' -> { a, b -> a - b }
    '*' -> { a, b -> a * b }
    else -> { a, b -> a / b }
}

//--------2. 使用尾随Lambda表达式----
fun calculatePrint1(funN: (Int, Int) -> Int) {//定义一个函数参数是函数类型
    //使用funN参数
    println("${funN(10, 5)}")
}

//--------3. 省略参数声明----------
fun revreseAndPrint(str: String, funN: (String) -> String) {
    val result = funN(str)
    println(result)
}

fun main(args: Array<String>) {

    //--------2. 使用尾随Lambda表达式----
    //调用ch9.8.2.kt中的calculatePrint
    calculatePrint(10, 5, '+', { a, b -> a + b })//标准形式
    calculatePrint(10, 5, '-') { a, b -> a - b }//尾随Lambda表达式形式

    calculatePrint1({ a, b -> a + b })//标准形式
    calculatePrint1() { a, b -> a + b }//尾随Lambda表达式形式
    calculatePrint1 { a, b -> a + b }//尾随Lambda表达式，如果只有没有参数可省略括号

    //--------3. 省略参数名----------
    revreseAndPrint("hello", { s -> s.reversed() })//标准形式
    revreseAndPrint("hello", { it.reversed() })//省略参数，使用隐式参数it

    val result1 = { a: Int -> println(a) }//不能省略参数声明
    val result2:(Int)->Unit = {  println(it) }//可以省略参数声明
    result2(30)      //输出结果是30

}