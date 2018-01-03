/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/
//代码文件：chapter4/src/ch4.2.3.kt

class Person(val name: String, val age: Int)

public fun main(args: Array<String>) {

    val p1 = Person("Tony", 18)

    println(p1.name)
    println(p1.age)

    //p1 = Person("Tom", 20) //编译错误
}


