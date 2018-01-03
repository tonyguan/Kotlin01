/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/

//Java代码文件：chapter15/src/main/java/com/a51work6/section2/Person.java
package com.a51work6.section2;

import java.util.Date;

public class Person {
    // 名字
    private String name = "Tony";
    // 年龄
    private int age = 18;
    // 出生日期
    private Date birthDate;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
