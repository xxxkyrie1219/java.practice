package controllerloop;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        //键盘录入一个大于等于2的整数，判断是否为质数
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<2)
            System.out.println("请重新输入");
        int count=0;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                count++;
            break;
        }
        if(count==0)
            System.out.println(n+"是质数");
        else
            System.out.println(n+"不是质数");
    }
}
