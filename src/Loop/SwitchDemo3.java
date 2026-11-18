package Loop;

public class SwitchDemo3 {
    public static void main(String[] args) {
        /*switch新特性：JDK12预览版 JDK14正式版
        一：箭头标签 ->
        二：case后面可以写多个值，逗号隔开
        三：switch可以有运行结果
        四：yield关键词
         */
        int num = 5;
        String name = switch (num) {
            case 1, 2, 3 -> {
                yield "一";
            }
            case 4, 5, 6 -> {
                yield "二";
            }
            default -> {
                yield "其他";
            }
            /*若语句体只有一行，则可以简化为：
            case 1, 2, 3 -> "一";
            case 4, 5, 6 -> "二";
            default -> "其他";*/
        };
        System.out.println(name);
    }
}