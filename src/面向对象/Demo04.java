package 面向对象;

public class Demo04 {
    String name;
    int number;
    int age;
    public void run(){
        System.out.println("学生信息:"+"学号："+this.number+"，"+"姓名："+this.name+"，"+"年龄："+this.number+"，");
    }

    public static void main(String[] args) {
        Demo04 p = new Demo04();
        p.number = 1000;
        p.name = "张三";
        p.age = 18;
        p.run();

        Demo04 p1 = new Demo04();
        p1.number = 1001;
        p1.name = "李四";
        p1.age = 19;
        p1.run();
    }
}
