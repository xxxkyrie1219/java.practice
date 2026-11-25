package it.opp.opp10;

public class test {
    public static void main(String[] args) {
        Student.teacherName="小雯老师";
        //创建第一个学生对象
        Student s1=new Student();
        s1.name="小诗诗";
        s1.age=19;
        //Student.teacherName="小雯老师";
        //创建第二个学生对象
        Student s2=new Student();
        s2.name="小丹丹";
        s2.age=20;
        s2.teacherName="阿伟老师";
        System.out.println(s1.name+" "+s1.age+" "+s1.teacherName);
        System.out.println(s2.name+" "+s2.age+" "+s2.teacherName);
    }




}
