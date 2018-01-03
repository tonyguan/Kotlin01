/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/

//代码文件：chapter4/src/ch4.4.2.kt

public fun main(args: Array<String>) {

    val englishScore = 95
    val chineseScore = 98

    //if控制结构表达式
    val result = if (englishScore < 60) "不及格" else "及格"
    println(result)

    val totalScore = sum(englishScore, chineseScore)
    println(totalScore)

    //try表达式
    val score = try {
        //TODO
    } catch (e: Exception) {
        return
    }
}

fun sum(a: Int, b: Int): Int = a + b    //表达式函数体