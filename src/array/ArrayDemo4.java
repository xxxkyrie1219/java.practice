package array;

import java.util.Scanner;

public class ArrayDemo4 {
    public static void main(String[] args) {
        //数组的动态初始化
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入5个数字：");
        for(int i=0;i<5;i++)
            arr[i]=sc.nextInt();
    }
}
