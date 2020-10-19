package 作业;

import java.util.Scanner;

public class Work07 {
    /**
     * 声明2个double 类型变量并赋值，判断第一个数大于10.0且第二个数小于20.0，打印两数之和，否则打印两数的乘积。
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a;
        System.out.println("请输入a值:");
        a = input.nextDouble();
        double b;
        System.out.println("请输入b值:");
        b = input.nextDouble();
        if (a > 10 && b < 20) {
            System.out.println("计算a,b之和:" + (a + b));
        } else {
            System.out.println("a,b相乘" + (a * b));
        }
    }
}
