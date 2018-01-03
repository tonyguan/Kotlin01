/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/
//代码文件：chapter13/src/com/a51work6/section3/Song.kt
package com.a51work6

data class Song(val title: String, val durationInSeconds: Int)

//测试使用
val songs = listOf(Song("Speak to Me", 90),
        Song("Breathe", 163),
        Song("On he Run", 216),
        Song("Time", 421),
        Song("The Great Gig in the Sky", 276),
        Song("Money", 382),
        Song("Us and Them", 462),
        Song("Any Color You Like", 205),
        Song("Brain Damage", 228),
        Song("Eclipse", 123)
)