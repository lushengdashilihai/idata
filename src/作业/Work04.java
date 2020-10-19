package 作业;

import java.util.Scanner;

public class Work04 {
    /**
     * 提示从键盘输入3个数（其中一个提示使用（+、-、*、/）用来代表加减乘除的符号，
     * 其余两个数用来计算），用来分别进行加/减/乘/除的运算
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个数：");
        int num1 = sc.nextInt();
        System.out.println("输入第二个数：");
        int num2 = sc.nextInt();
        System.out.println("输入运算符：");
        char ch = sc.next().charAt(0);
        int result = 0; //保存运算结果

        switch (ch) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;

            default:

        }
    }
}