package Loop;

import java.util.Scanner;

public class forDemo1 {
    public static void main(String[] args) {
        /*
        需求：键盘录入两个数字，表示一个范围。
        统计这个范围中，既能被3整除，又能被5整除的数字有多少个？

        累加思想：数字---->sum
        统计思想：count--->满足条件++
         */
        int count=0;
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        //比较num1 num2 的大小
        int max=num1>num2?num1:num2;
        int min=num1<num2?num1:num2;
        for(int i=min;i<=max;i++){
            if(i%3==0&&i%5==0)
                count++;
        }
        System.out.println("满足条件的数字有"+count+"个");
    }
}
