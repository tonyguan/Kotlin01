/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/

//代码文件：chapter7/src/com/a51work6/Person.kt
package com.a51work6

class Person(val name: String, val age: Int) {
    //自定义比较规则
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Person) {
            return false
        }
        return (name == other.name && age == other.age)
    }
}