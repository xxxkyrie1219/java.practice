package Loop;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        //定义一个变量表示人的体温，对提问进行判断是否大于等于38度，如果超过打印语音警告
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入体温：");
    double temp=sc.nextDouble();
    if(temp>=38){
        System.out.println("体温异常");
    }else{
        System.out.println("体温正常");
    }
    /*
      1.如果大括号语句体只有1行，大括号可以省略
      2.小括号后面不能有分号，这样会拆开if的语句结构
      3.判断布尔类型的变量，直接把变量写在小括号中即可
     */

    }
}
