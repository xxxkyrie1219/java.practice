package array;

public class test2 {
    public static void main(String[] args) {
        /*
        需求：已知数组元素为{33，5，22，44，55}
        请找出数组中最大值并打印在控制台
         */
        int[] arr={33,5,22,44,55};
        int max=arr[0];
        //max的初始化值不能为0，数组中的元素可能为负数
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println(max);
    }
}
