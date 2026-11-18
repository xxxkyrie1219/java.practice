package com.zuojinhai.literal;

import java.util.Scanner;

public class OperatorDemo2 {
    public static void main(String[] args) {
        /*时间转换：
        给定秒数seconds，将其转换为对应的小时数，分钟数和秒数，使得总时间不变，但分钟数和秒数都不超过59
        输入描述：
        在一行中输入一个整数seconds表示要转换的秒数。
        输出描述：一行，包含三个整数，依次为输入整数对应的小时数，分钟数和秒数（可能为0），中间用一个空格隔开。
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个秒数");
        int seconds=sc.nextInt();
        int hour=seconds/3600;
        int min=seconds%3600/60;
        int scnd=seconds%60;
        System.out.println(hour+" "+min+" "+scnd);
    }
}
