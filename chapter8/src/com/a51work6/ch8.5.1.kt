/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/
//代码文件：chapter8/src/com/a51work6/ch8.5.1.kt
package com.a51work6

fun main(args: Array<String>) {

    for (x in 0..5) {   //声明闭区间包含0和5
        print("$x,")
    }
    println()

    for (x in 0 until 5) {  //声明半开区间包含0，不包含5
        print("$x,")
    }
    println()
    for (x in 'A'..'E') {  //声明闭区间包含'A'和'E'
        print("$x,")
    }
    println()

    for (x in 'A' until 'E') { //声明半开区间包含'A'，不包含'E'
        print("$x,")
    }
}