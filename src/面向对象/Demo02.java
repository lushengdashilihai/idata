package 面向对象;

public class Demo02 {
    String name;
    int age;
    String classs;
    String kind;
    public void print(){
        System.out.println("姓名:"+name+",年龄:"+age+",班级:"+classs+",爱好:"+kind);

    }
    public static void main(String[] args) {
        Demo02 person = new Demo02();
        person.name = "张浩";
        person.age = 20;
        person.classs = "S1班";
        person.kind = "篮球";
        person.print();
    }
}
