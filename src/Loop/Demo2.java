package Loop;

import java.util.Scanner;

public class Demo2 {
    public  static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("烧烤的价格是：");
        int num=sc.nextInt();
        double elm=num*0.9;
        double mt=(num>=30?num-10:num);
        if(elm>mt)
            System.out.println("美团更划算");
        else if(elm<mt)
            System.out.println("饿了么更划算");
        else
            System.out.println("两家一样划算");
    }
}
