/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/
//代码文件：chapter14/src/main/kotlin/com/a51work6/section2/s2/ch14.2.2.kt
package com.a51work6.section2.s2

import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.SchemaUtils.create
import org.jetbrains.exposed.sql.transactions.transaction

// 声明部门表
object Departments : Table() {
    //声明表中字段
    val id = integer("id").autoIncrement().primaryKey()
    val name = varchar("name", length = 30)
}

const val URL = "jdbc:mysql://localhost:3306/testDB?useSSL=false&verifyServerCertificate=false"
const val DRIVER_CLASS = "com.mysql.jdbc.Driver"

fun main(args: Array<String>) {
    //连接数据库
    Database.connect(URL, user = "root", password = "12345", driver = DRIVER_CLASS)
    //操作数据库
    transaction {
        //创建部门表Departments
        create(Departments)
        //部门表插入数据
        Departments.insert {
            it[name] = "销售部"
        }
        Departments.insert {
            it[name] = "技术部"
        }
        showDatas()

        //更新数据
        Departments.update({ Departments.name eq "销售部" }) {
            it[name] = "市场部"
        }
        showDatas()

        //删除数据
        Departments.deleteWhere { Departments.id lessEq 1 }
        showDatas()
    }
}


//查询所有数据，并打印
fun showDatas() {
    println("---------------------")
    Departments.selectAll().forEach {
        println("${it[Departments.id]}: ${it[Departments.name]}")
    }
}