package 选择结构与循环结构;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的java成绩:");
        int JScore = sc.nextInt();
        System.out.println("请输入您的音乐成绩:");
        int YScor = sc.nextInt();*/
        Scanner input = new Scanner(System.in);
        System.out.println("请输入您的心跳值");
        int heartBeats = input.nextInt();
        if (heartBeats < 65 || heartBeats > 100) {
            System.out.println("您需要去医院做进一步检查了");


        }
    }
}
