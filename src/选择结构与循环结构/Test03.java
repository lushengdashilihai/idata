package 选择结构与循环结构;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入您的年龄");
        int age = input.nextInt();

        if (age < 0) {
            System.out.println("您输入的年龄不正确,请重新输入!");

        } else if (age < 18) {
            System.out.println("青少年时期");
        } else if (age < 35) {
            System.out.println("青壮年时期");
        } else if (age < 60) {
            System.out.println("中年时期");
        } else if (age < 100) {
            System.out.println("老年时期");
        } else {
            System.out.println("恭喜您成仙了!");
        }//else if 不要超过3个
    }
}
