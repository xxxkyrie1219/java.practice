package method;

import java.util.Random;

public class methodDemo1 {
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
            if(!contains(n,arr)) {
                arr[i]=n;
                i++;
            }
        }
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    //定义一个方法，判断n在数组arr中是否存在
    public static boolean contains(int n, int[] arr){
        for(int i=0;i<arr.length;i++){
            if(n==arr[i])
                //遇到合适的，直接返回true
                //此时方法直接结束
                return true;
        }
        //如果循环结束了，数组里面所有元素都判断完毕了，还没找到一样的，直接返回false，表示n在arr中是不存在的
        return false;
    }

}
