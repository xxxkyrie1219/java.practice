package Loop;

import java.util.Random;
import java.util.Scanner;

public class guess {
    public static void main(String[] args) {
        //猜数字游戏
        //生成一个1-100之间的随机数，利用键盘录入模拟猜的动作，一直猜，直到猜中为止
        /*生成一个随机数的三种方法：
        一：int n=r.nextInt();默认是在int的取值范围之内获取随机数
        二：小括号写一个数字n，表示随机的最大值，但是不包含这个值，例如r.nextInt(100)表示0-99
        三：小括号写两个数字，表示随机的范围，例如r.nextInt(10,20)表示10-19，包含10，不包含20   JDK17
         */
        Random r=new Random();
        int num=r.nextInt(1,101);
        while (true) {
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入你要猜的数字");
            int guess=sc.nextInt();
            if(guess>num)
                System.out.println("猜大了");
            else if(guess<num)
                System.out.println("猜小了");
            else {
                System.out.println("猜对了");
                break;
            }
        }


    }
}
