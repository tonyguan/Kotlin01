/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/
//代码文件：chapter10/src/com/a51work6/section6/User.kt
package com.a51work6.section6

//class User(val name: String, var password: String)
//class User constructor(val name: String, var password: String)
//class User private constructor(val name: String, var password: String)

//默认构造函数
class User {
    // 用户名
    var username: String?
    // 用户密码
    var password: String?

    init {
        username = null
        password = null
    }
}
