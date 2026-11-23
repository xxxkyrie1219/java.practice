package it.opp.opp7;

public class Student {
    private String name;
    private int age;
    private int height;
    private int weight;
    //针对每一个私有化1的成员变量，提供get/set方法
    public void setName( String value){
        name=value;
    }
    public String getName(){
        return name;
    }
    public void setAge(int n){
        if(n>0&&n<=120)
            age=n;
        else
            System.out.println("年龄不在合理范围内");
    }
    public int getAge(){
        return age;
    }
    public void setHeight(int num){
        height=num;
    }
    public int getHeight(){
        return height;
    }
    public void setWeight(int num) {
        weight = num;
    }
    public int getWeight() {
        return weight;
    }
    //行为：学习
    public void study(){
        System.out.println("学生正在学习");
    }
}
