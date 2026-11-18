package com.zuojinhai.literal;
import java.sql.SQLOutput;
import java.util.Scanner;
public class ScannerDemo3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的体重");
        int weight=sc.nextInt();
        System.out.println("请输入你的身高");
        double height=sc.nextDouble();
        double bmi=weight/(height*height);
        System.out.println("你的bmi为："+bmi);


    }
}
