package finalTest;

public class Finaltest {
    public static void main(String[] args) {
        /*
         final修饰变量，此时叫做常量
         特点1：只能赋值一次，一旦赋值，无法再次修改。
         特点2：常量名大写，多个单词之间用下划线隔开
      细节：
      基本数据类型：
      byte short int long float double char boolean
      变量里里记录的是真实的数据
      final int a=10;此时变量里记录的数据无法发生改变
      引用数据类型：
      除了上面的四类八种，其他的所有类都是引用数据类型
      int[] Student Teacher...
      stu里面记录的是对象的地址，不可改变的是stu记录的内存地址
      而对象里面的属性值是可以发生改变
      final int[] arr={1,2,3};
      arr[0]=100; //可以
      arr={1,2,3,4}; //不可以

     综上所述：final修饰哪个变量，这个变量里面记录的内容就无法再次发生改变
         */
        final int a=10;
         final Student stu=new Student();
        System.out.println(stu.name);
    }
}
