package it.opp.opp10;

public class Student {
    /*
        关于static
        1.静态变量，被当前类所有的对象共享
        共享：
            赋值只要赋值一次
            只要有1个对象修改了静态变量，其他对象再次访问的时候就是修改之后的结果了
        2.调用方式：类名调用和对象名调用
     */
    String name;
    int age;
    //学生共享一个老师
    static String teacherName;
}
