package com.zuojinhai.literal;

import java.sql.SQLOutput;

public class VariableDemo1 {
    public static void main(String[] args) {

    /*微信余额：0元
    支付宝余额：10元
    银行卡余额：20元
    问题1：一共多少钱
    问题2：微信收了10元红包，又发了2元红包，余额多少？？
     */


    //1.定义一个变量记录微信的余额
    double a=0;
    //2.定义一个变量记录支付宝的余额
    double b=10;
    //3.定义一个变量记录银行卡的余额
    double c=20;
    //4.输出现在总共有多少钱
    System.out.println(a+b+c);
    //5.微信收了10元红包，又发了2元红包，余额多少？
        a=a+10;
        a=a-2;
        System.out.println(a+b+c);
    }
}
