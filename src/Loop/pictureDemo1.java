package Loop;

public class pictureDemo1 {
    public static void main(String[] args) {
        /*
             打印4行5列的*
             *****
             *****
             *****
             *****
             限定：每次只能输出一个*
         */
        //System.out.println("*");   先打印，再换行；
        //System.out.print("*");     只打印，不换行；
        for(int i=1;i<=4;i++){
            //在一行打印5个*
            for(int j=1;j<=5;j++)
                System.out.print("*");
            //换行
            System.out.println( );
        }
    }
}
