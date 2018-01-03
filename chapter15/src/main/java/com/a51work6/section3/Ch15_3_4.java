/*
* Created by 智捷课堂
* 本书网站：www.51work6.com 
* 智捷课堂在线视频：www.zhijieketang.com
* 智捷课堂微信公共号：zhijieketang
* 邮箱：eorient@sina.com
* 
*/

//Java代码文件：chapter15/src/main/java/com/a51work6/section3/ch15_3_4.java
package com.a51work6.section3;

import com.a51work6.section3.s4.Department;
import com.a51work6.section3.s4.Employee;
import com.a51work6.section3.s4.EmployeeKt;

public class Ch15_3_4 {

    public static void main(String[] args) {

        Employee emp = new Employee();
        //访问Kotlin中内部可见性的Employee成员属性no
        //int no = emp.getNo$production_sources_for_module_chapter15_main();

        Department dept = new Department();
        //访问Kotlin中公有可见性的Department成员属性name
        dept.setName("市场部");

        //访问Kotlin中公有可见性的Employee中成员属性dept
        emp.setDept(dept);
        System.out.println(emp.getDept());

        //访问Kotlin中内部可见性的顶层属性MAX_COUNT
        System.out.println(EmployeeKt.MAX_COUNT);
    }
}

class SubDepartment extends Department {
    void display() {
        //继承Kotlin中Department类保护可见性的成员属性no
        System.out.println(this.getNo());
        //继承Kotlin中Department类公有可见性的成员属性name
        System.out.println(this.getName());
    }
}