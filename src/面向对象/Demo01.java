package 面向对象;

public class Demo01 {
    //属性 (成员变量): 姓名 性别 年龄
    String name;
    char sex;
    int age;

    //方法  (成员方法): 吃.喝
    public void eat() {
        System.out.println("吃饭!!");
    }

    public void drink() {
        System.out.println("喝牛奶!");
    }

    public void showInfo() {
        System.out.println("我叫:" + name + ";我是" + sex + "儿;今年" + age + "岁");
    }



}
