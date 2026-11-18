package array;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] arr=new int[]{18,19,20};
        int num=arr[0];
        System.out.println(num);
        System.out.println(arr[0]);
        /*    修改数据
        arr[索引]=新数据；
        注意：一旦修改完毕，原来的数据就被覆盖了；
         */
        arr[0]=21;
        System.out.println(arr[0]);
    }
}
