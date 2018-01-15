/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
*
*/
//代码文件：chapter9/src/com/a51work6/section10/ch9.10.3.kt
package com.a51work6.section10

import java.awt.BorderLayout
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JLabel

class MyFrame(title: String) : JFrame(title) {

    init {
        // 创建标签
        val label = JLabel("Label")

        // 创建Button1
        val button1 = JButton()
        button1.text = "Button1"
        button1.toolTipText = "Button1"
        // 注册事件监听器，监听Button1单击事件
        button1.addActionListener { label.text = "单击Button1" }

        // 创建Button2
        val button2 = JButton().apply {
            text = "Button2"
            toolTipText = "Button2"
            // 注册事件监听器，监听Button2单击事件
            addActionListener { label.text = "单击Button2" }
            // 添加Button2到内容面板
            contentPane.add(this, BorderLayout.SOUTH)
        }

        with(contentPane) {
            // 添加标签到内容面板
            add(label, BorderLayout.NORTH)
            // 添加Button1到内容面板
            add(button1, BorderLayout.CENTER)
            println(height)
            println(this.width)
        }


        // 设置窗口大小
        setSize(350, 120)
        // 设置窗口可见
        isVisible = true
    }
}

fun main(args: Array<String>) {
    //创建Frame对象
    MyFrame("MyFrame")
}