/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/

//代码文件：chapter5/src/com/a51work6/ch5.4.2.kt
//安全调用运算符（?.）
package com.a51work6

//声明除法运算函数
fun divide(n1: Int, n2: Int): Double? {

    if (n2 == 0) {//判断分母是否为0
        return null
    }
    return n1.toDouble() / n2
}

fun main(args: Array<String>) {

    val divNumber1 = divide(100, 0)
    val result1 = divNumber1?.plus(100)//divNumber1+100，结果null
    println(result1)

    val divNumber2 = divide(100, 10)
    val result2 = divNumber2?.plus(100)//divNumber2+100，结果110.0
    println(result2)
}