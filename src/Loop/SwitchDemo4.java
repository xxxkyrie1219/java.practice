package Loop;

import com.zuojinhai.literal.OperatorDemo1;

import java.util.Scanner;

public class SwitchDemo4 {
    public static void main(String[] args) {
        //利用switch模拟计算器+ - * /
        Scanner sc=new Scanner(System.in);
        int a=10;
        int b=20;
        String Operator=sc.next();
        int result=switch(Operator){
            case "+"->a+b;
            case "-"->a-b;
            case "*"->a*b;
            case "/"->a/b;
            default->0;
        };
        System.out.println("结果是"+result);
    }
}
