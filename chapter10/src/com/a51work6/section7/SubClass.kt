/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/

//代码文件：chapter10/src/com/a51work6/section7/SubClass.kt
package com.a51work6.section7

class SubClass : ProtectedClass() {

    fun display() {
        printX()//printX()函数是从父类继承过来
        println(x)//x属性是从父类继承过来
    }
}
