package Loop;

import java.util.Scanner;

public class forDemo3 {
    public static void main(String[] args) {
        /*计算数列前n项和
        S(n)=1-2+3-4+...
        */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0)
                sum -= i;
            else
                sum += i;

        }
        System.out.println("S(n)="+sum);
    }
}
