/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/

//代码文件：chapter4/src/ch4.5.kt

import com.a51work6.Date  //引入该包下Date类
import com.a51work6.add   //引入该包下add函数
//import com.a51work6.*   //引入该包下所有内容
//import java.util.Date  //引入该包下Date类

public fun main(args: Array<String>) {

    val date = Date()
    System.out.println(date)
    val now = java.util.Date()
    println(now)

    val totalScore = add(100, 97)
    println(totalScore)
}