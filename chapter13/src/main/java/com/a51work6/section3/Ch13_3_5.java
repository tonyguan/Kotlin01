/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/

//Java代码文件：chapter13/src/main/java/com/a51work6/section3/Ch15_3_5.java
package com.a51work6.section3;

import com.a51work6.section3.s5.Animal;
import com.a51work6.section3.s5.AnimalKt;
import com.a51work6.section3.s5.DisplayOverloading;

public class Ch13_3_5 {
    public static void main(String[] args) {

        Animal animal1 = new Animal(10, true);
        Animal animal2 = new Animal(10);

        DisplayOverloading dis1 = new DisplayOverloading();
        dis1.display('A');
        dis1.display('B', 20);

        AnimalKt.makeCoffee();
        AnimalKt.makeCoffee("摩卡咖啡");
    }
}
