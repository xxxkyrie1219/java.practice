package Loop;

import java.util.Scanner;

public class SwitchDemo1 {
    public static void main(String[] args) {
        //需求：输入星期数，显示今天的减肥活动
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入星期数：");
        /*
            1.default的位置和省略
            位置：casehedefault是没有标准的上下之分，位置可以任意地书写
            省略：default可以省略不写。在此时如果所有的case不匹配，则没有任何输出结果
            2.case穿透
            如果case语句执行完毕没有遇到break语句，则会穿透执行下一个case语句，直到遇到break语句为止
            应用场景：当多个case的语句体重复时，利用case穿透节省代码
         */
        int week=sc.nextInt();
        switch(week){
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
                break;
            case 4:
                System.out.println("瑜伽");
                break;
            case 5:
                System.out.println("爬山");
                break;
            case 6:
                System.out.println("舞蹈");
                break;
            case 7:
                System.out.println("休息");
                break;
            default:
                System.out.println("输入错误");
                break;

        }
    }
}
