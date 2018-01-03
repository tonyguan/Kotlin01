/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/

//Java代码文件：chapter15/src/main/java/com/a51work6/section3/ch15_3_3.java
package com.a51work6.section3;

import com.a51work6.section3.s3.Account;
import com.a51work6.section3.s3.Person;
import com.a51work6.section3.s3.Singleton;
import com.a51work6.section3.s3.StaticFieldDemo;

import java.util.Date;

public class Ch15_3_3 {
    public static void main(String[] args) {
        Person p = new Person();
        //访问实例字段
        System.out.println(p.name);       //Tony
        System.out.println(p.birthDate);  //null
        //访问静态字段
        System.out.println(Singleton.x); //10
        Singleton.birthDate = new Date();
        System.out.println(Account.interestRate); //0.018
        System.out.println(StaticFieldDemo.MAX_COUNT); //500
        //访问静态函数
        Singleton.displayX();
        Account.interestBy(5000);
    }
}
