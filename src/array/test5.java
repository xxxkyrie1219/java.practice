package array;

import java.util.Random;

public class test5 {
    public static void main(String[] args) {
        int [] arr= new int[10];
        Random r=new Random();
        for (int i=0;i<arr.length;) {
            //注意i++的位置
            int n=r.nextInt(101);
            //对n进行判断
            int count=0;
            for(int j=0;j<i;j++){
                if (n == arr[j])
                    count++;
                break;
            }
            if(count==0)
                arr[i]=n;
            i++;
        }
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}
