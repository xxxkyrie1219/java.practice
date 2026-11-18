package com.zuojinhai.literal;

import java.util.Scanner;

public class OperatorDemo1 {
    public static class OPerator {
        public static class OperatorDemo2 {
            public static void main(String[] args) {
                //需求：键盘录入一个三位数，将其拆分为个位，十位，百位后打印在控制台
                Scanner sc=new Scanner(System.in);
                System.out.println("请输入一个三位数");
                int num=sc.nextInt();
                int ge=num%10;
                int shi=num/10%10;
                int bai=num/100%10;
                System.out.println("个位是"+ge+",十位是"+shi+"，百位是"+bai);
                //alt+p：强制让AI自动生成代码
            }
        }
    }
}
