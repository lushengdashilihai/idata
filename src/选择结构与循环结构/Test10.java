package 选择结构与循环结构;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        int i, j;

        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int val = input.nextInt();
        System.out.println("根据这个数值可以输出以下加法表:");
        for (i = 0, j = val; i <= val; i++, j--) {
            System.out.println(i + "+" + j + "=" + (i + j));

        }
    }
}
