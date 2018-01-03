/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/
//代码文件：chapter4/src/ch4.1.1.kt
public fun main(args: Array<String>) {

    val `class` = "舞蹈学习班"   //class是硬关键字，前后添加反引号（`），可以用于声明标识符
    val `π` = 3.14159           //Unicode编码，可以用于声明标识符
    var 您好 = "世界"           //Unicode编码，可以用于声明标识符
    var public = "共有的"      //public是修饰符关键字，可以用于声明变量标识符
    println(`class`)
    println(π)

    val it = 100                //it是普通标识符
    val ary = arrayListOf<String>("A", "B", "C")    //创建一个数组
    ary.forEach { println(it) } //it特定标识符
}

