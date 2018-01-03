/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/

//代码文件：chapter10/src/com/a51work6/section11/ch10.11.2.kt
package com.a51work6.section11

interface DAOInterface {
    //插入数据
    fun create(): Int
    //查询所有数据
    fun findAll(): Array<Any>?
}

object UserDAO : DAOInterface {
    //保存所有数据属性
    private var datas: Array<Any>? = null

    override fun findAll(): Array<Any>? {
        //TODO 查询所有数据
        return datas
    }

    override fun create(): Int {
//        object Singleton {
//            val x = 10
//        }
        return 0
    }

    object Singleton {
        val x = 10
    }
}

//外部类
class Outer {
    object Singleton {
        val x = 10
    }
}
fun main(args: Array<String>) {

    UserDAO.create()
    var datas = UserDAO.findAll()

    println(UserDAO.Singleton.x)

//    object Singleton {
//        val x = 10
//    }
}

