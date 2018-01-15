/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/
//代码文件：chapter14/src/main/kotlin/com/a51work6/section3/ch14.3.kt
package com.a51work6.section3

import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.SchemaUtils.create
import org.jetbrains.exposed.sql.transactions.transaction

// 声明部门表
object Departments : Table() {
    //声明表中字段
    val id = integer("id").autoIncrement().primaryKey()
    val name = varchar("name", length = 30)
}

// 声明员工表
object Employees : Table() {
    //声明表中字段
    val id = integer("id").autoIncrement().primaryKey()
    val name = varchar("name", length = 50)
    val deptId = (integer("dept_id") references Departments.id).nullable()
}

const val URL = "jdbc:mysql://localhost:3306/testDB?useSSL=false&verifyServerCertificate=false"
const val DRIVER_CLASS = "com.mysql.jdbc.Driver"

fun main(args: Array<String>) {
    //连接数据库
    Database.connect(URL, user = "root", password = "12345", driver = DRIVER_CLASS)
    //操作数据库
    transaction {
        logger.addLogger(StdOutSqlLogger)
        //创建表
        create(Departments, Employees)
        //部门表插入数据
        val deptId1 = Departments.insert {
            it[name] = "销售部"
        } get Departments.id
        val deptId2 = Departments.insert {
            it[name] = "技术部"
        } get Departments.id
        Departments.insert {
            it[name] = "财务部"
        }

        //员工表插入数据
        Employees.insert {
            it[name] = "张三"
            it[deptId] = deptId1
        }
        Employees.insert {
            it[name] = "李四"
            it[deptId] = deptId2
        }
        Employees.insert {
            it[name] = "王五"
            it[deptId] = deptId2
        }
        //1.查询“技术部”的所有员工信息
        (Employees innerJoin Departments).slice(Employees.id, Employees.name, Departments.name).
                select { Departments.name eq "技术部" }.forEach {
            println("${it[Employees.id]}：${it[Employees.name]} 所在部门：${it[Departments.name]}")
        }
        //2.查询员工“张三”所在部门信息
        (Employees innerJoin Departments).slice(Departments.id, Departments.name, Employees.name).
                select { Employees.name eq "张三" }.forEach {
            println("员工：${it[Employees.name]} 所在部门：${it[Departments.id]}：${it[Departments.name]}")
        }
    }
}