/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/

//Java代码文件：chapter13/src/main/java/com/a51work6/section3/Ch15_3_2.java
package com.a51work6.section3;

//import com.a51work6.section3.s1.ch15_3_2Kt;
import com.a51work6.section3.s1.PackageLevelDemo;

public class Ch13_3_2 {
    public static void main(String[] args) {
        //访问顶层函数
        //Double area = ch15_3_2Kt.rectangleArea(320.0, 480.0);
        Double area = PackageLevelDemo.rectangleArea(320.0, 480.0);
        System.out.println(area);

        //访问顶层属性
        //System.out.println(ch15_3_2Kt.getArea());
        System.out.println(PackageLevelDemo.getArea());
    }
}
