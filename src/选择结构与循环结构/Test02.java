package 选择结构与循环结构;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入您的考试成绩:");
        int score = input.nextInt();
        if (score > 90) {
            System.out.println("优秀");
        } else if (score >= 80) {
            System.out.println("良好");

        } else if (score >= 60) {
            System.out.println("中等");
        } else {
            System.out.println("差");

        }
        System.out.println("感谢使用!!!!");

    }
}
