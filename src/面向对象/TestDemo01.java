package 面向对象;

public class TestDemo01 {
    public static void main(String[] args) {

        //创建对象  new 对象..
        //  语法:类名 对象名 = new 类型();
        Demo01 d = new Demo01();
        //引用(调用)类的属性
        d.name = "亚索";
        d.sex = '孤';
        d.age = 20;
        //引用(调用)类的方法
        d.eat();
        d.drink();
        d.showInfo();
    }
}
