package 面向对象;

public class Demo03 {
    String name;
    String name1;
    String name2;
    int age;
    public void print(){
        System.out.println("姓名:"+name+",\n专业方向:"+name1+",\n课程:"+name2+",\n教龄:"+age);
    }

    public static void main(String[] args) {
        Demo03 person = new Demo03();
        person.name = "王老师";
        person.name1 = "计算机";
        person.name2 = "使用java语言理解程序逻辑";
        person.age = 5;
        person.print();

    }

}
