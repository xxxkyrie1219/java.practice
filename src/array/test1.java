package array;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        //查找数据在数组中的索引
        int[] arr={33,5,22,44,55,33};
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(num ==arr[i]){
                System.out.println(i);
                break;
            }else if(i==arr.length-1)
                System.out.println("没有找到");
        }
    }
}
