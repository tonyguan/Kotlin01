/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/

//Java代码文件：chapter13/src/main/java/com/a51work6/section3/Ch15_3_1.java
package com.a51work6.section3;

public class Ch13_3_1 {
    public static void main(String[] args) {
        User user = new User("Tom", "12345");
        System.out.println(user.getName()); //Tom
        user.setPassword("54321");
        System.out.println(user.getPassword());//54321
    }
}

