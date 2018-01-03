/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/
//代码文件：chapter16/src/main/kotlin/com/a51work6/section2/s3/ch16.2.3.kt
package com.a51work6.section2.s3

import org.jetbrains.exposed.dao.EntityID
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.IntIdTable
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils.create
import org.jetbrains.exposed.sql.selectAll
import org.jetbrains.exposed.sql.transactions.transaction

// 声明部门表
object Departments : IntIdTable() {
    //声明表中字段
    val name = varchar("name", length = 30)
}
// 声明部门实体
class Department(id: EntityID<Int>) : IntEntity(id) {
    //为数据表Departments与实体Department建立映射关系
    companion object : IntEntityClass<Department>(Departments)

    var name by Departments.name
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

        //部门实体中插入数据
        Department.new {
            name = "销售部"
        }

        val dept = Department.new {
            name = "技术部"
        }
        showDatas()

        //修改部门实体属性
        dept.name = "市场部"
        showDatas()

        //删除部门实体
        dept.delete()
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