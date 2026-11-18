package Loop;

public class forDemo2 {
    public static void main(String[] args) {
        //斐波那契数列
        int a=1;
        int b=1;
        int c=0;
        for(int i=0;i<=20;i++){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}
