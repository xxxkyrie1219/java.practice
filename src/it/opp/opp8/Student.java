package it.opp.opp8;

public class Student {
    private int age;
    public void setAge(){
        //this关键字的使用
        int age=10;
        System.out.println(age);//触发就近原则，局部变量age
        System.out.println(this.age);//成员变量age

    }

}
