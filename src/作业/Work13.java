package 作业;

import java.util.Scanner;

public class Work13 {
    public static void main(String[] args) {
        //4、从键盘输入一位整数，当输入1~7时，输出“星期一”~“星期日”
        //输入其他数字时，提示用户重新输入
        Scanner input = new Scanner(System.in);
        System.out.println("请输入数字:");
        int a = input.nextInt();
        switch (a) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("请重新输入!");
                break;
        }

    }
}

