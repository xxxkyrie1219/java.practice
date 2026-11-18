package array;

import java.util.Random;

public class test4 {
    public static void main(String[] args) {
        //获取10个1-100之间的随机数并存入到数组当中，要求保证数组是唯一的
        //核心思路
        //    如果存在，就不存，生成下一个
        //    不存在，就存进数组
        int [] arr= new int[10];
        Random r=new Random();
        for (int i=0;i<arr.length;) {
            //注意i++的位置
            int n=r.nextInt(100)+1;
            //对n进行判断
            int count=0;
            for(int j=0;j<arr.length;j++){
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
