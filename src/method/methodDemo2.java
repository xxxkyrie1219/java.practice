package method;

public class methodDemo2 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        printArray(arr);
    }
    //定义方法，实现数组的遍历
    //遍历格式如下：[1,2,3,4,5]
    public static void printArray(int[] arr){
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            //最后一个元素后面不需要逗号
            if(i<arr.length-1){
                //如果不是最后一个元素，就打印逗号
                System.out.print(",");
            }
        }
        System.out.println("]");

    }
}

