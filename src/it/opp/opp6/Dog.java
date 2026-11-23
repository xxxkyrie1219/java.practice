package it.opp.opp6;

public class Dog {
    /*
    1.private关键字：是一个权限修饰符可以修饰成员变量和成员方法。
    特点：被private修饰的成员变量和成员方法，在类的外部无法直接访问，只能在本类中访问。
    2.针对private修饰的成员变量，需提供以下操作：
          提供setXxx（参数），给成员变量赋值，用public修饰
          提供getXxx（），获取成员变量的值，用public修饰
     */



    //姓名，年龄
    private String name;
    private int age;

    //get  set
    //name
    //value:表示将来要赋的值
    public void setName(String value){
        //给对象中的属性进行赋值
        name=value;
    }
    public String getName( ){
        return name;
    }
    //age
    public void setAge(int num){
        if(num>0&&num<20)
            age=num;
        else
            System.out.println(num+"不在合理范围内");

    }
    public int getAge(){
        return age;
    }
    //行为
    public void eat(){
        System.out.println(age+"岁的"+name+"在吃骨头");
    }


}