package it.opp.opp7;

public class Test {
    public static void main(String[] args) {
        /*
          要求1：大一新生，张三，18岁，183cm，60kg，刚进大学努力学习
          要求2：大二期间张三体重增加了10kg
          要求3：大三期间张三减肥成功，身高增加2cm，体重减少3kg
          要求4：打印大学毕业之后，张三的所有信息
         */
        Student s=new Student();
        s.setName("张三");
        s.setAge(18);
        s.setHeight(183);
        s.setWeight(60);
        //要求1
        System.out.println("大一新生，"+s.getName()+","+s.getAge()+"岁，"+s.getHeight()+"cm，"+s.getWeight()+"kg，刚进大学努力学习");
        //要求2：
        int newweight=s.getWeight()+10;
        s.setWeight(newweight);
        System.out.println("大二期间，"+s.getName()+","+s.getAge()+"岁，"+s.getHeight()+"cm，"+s.getWeight()+"kg");
        //要求3：
        int newheight=s.getHeight()+2;
        int newweight2=s.getWeight()-3;
        s.setHeight(newheight);
        s.setWeight(newweight2);
        System.out.println("大三期间，"+s.getName()+","+s.getAge()+"岁，"+s.getHeight()+"cm，"+s.getWeight()+"kg");
        //要求4：
        System.out.println("大学毕业之后，"+s.getName()+","+s.getAge()+"岁，"+s.getHeight()+"cm，"+s.getWeight()+"kg");
    }
}
