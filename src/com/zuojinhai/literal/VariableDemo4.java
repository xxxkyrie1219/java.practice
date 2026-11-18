package com.zuojinhai.literal;

public class VariableDemo4 {
    public static void main(String[] args) {
        double weight=60.5;
        double height=1.75;
        double bmi=weight/(height*height);
        double bmi1=18.5;
        double WEIGHT=bmi1*height*height;
        System.out.println("我的BMI是:"+bmi);
        System.out.println("体重最低是"+WEIGHT);
        /*JAVA语言数据类型的分类：
        基本数据类型    引用数据类型
        基本数据类型的四类八种：
        1.整数类型：
            byte
            short
            int
            long
        2.浮点类型：
            float
            double
        3.字符类型：
            char
        4.布尔类型：
            boolean
         */
    }
}
