package com.zuojinhai.literal;

import java.util.Scanner;

public class ScannerDemo2 {
    public static void main(String[] args) {
        //1.找到Scanner这个打工人
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数");
        //2.Scanner干活
        int num1=sc.nextInt();
        //3.让Scanner继续接收第二个整数
        System.out.println("请再输入第二个整数");
        int num2=sc.nextInt();
        //4.求和
        int sum=num1+num2;
        System.out.println("两数之和为："+ sum);
    }
}
