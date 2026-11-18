package array;

import java.util.Random;

public class test3 {
    public static void main(String[] args) {
        //打乱数组中的数据
        int[] arr={0,1,2,3,4,5,6,7,8,9};
        Random r=new Random();
        for(int i=0;i<arr.length;i++){
            int index=r.nextInt(arr.length);
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}
