package 作业;

import java.util.Scanner;

public class Work05 {
    /**
     * 要求用户输入一个整数，判断该数是奇数还是偶数。
     * 提示：能被2整除的整数为偶数，即该数除以2后余数为0，因此可以采用取余运算判断数的奇偶性。
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        int teger = sc.nextInt();
        int sum = teger % 2;
        if (sum == 0) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }
    }
}
