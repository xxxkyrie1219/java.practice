package method;

public class methodDemo3 {
    //定义一个方法，打印99乘法表
    public static void print99(){
        for(int i=0;i<10;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }

        }

    public static void main(String[] args) {
        print99();
    }
    }

