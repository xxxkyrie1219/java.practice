package Loop;

import java.util.Scanner;

public class whileDemo3 {
    public static void main(String[] args) {
        //给定一个整数n，请计算其所以位数之和。若n为负数，请先取其绝对值。
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        if(n<0)
            n=-n;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        System.out.println("各位数字之和为："+sum);
    }
}
