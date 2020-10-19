package 作业;

import java.util.Scanner;

public class Work06 {
    /**
     * 输入三个int型的数据，放入到a,b,c三个变量中去，使用条件结构与交换逻辑将这三个变量中的值从小到大排列。
     */
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("请输入要排序的三个数：");
        System.out.println("请输入a的值：");
        int a = input.nextInt();
        System.out.println("请输入b的值：");
        int b = input.nextInt();
        System.out.println("请输入c的值：");
        int c = input.nextInt();
        //判断
        int temp;
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (b > c) {
            temp = c;
            c = b;
            b = temp;
        }
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        System.out.println(a + "," + b + "," + c);
    }
}