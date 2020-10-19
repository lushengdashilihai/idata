package 作业;

import java.util.Scanner;

public class aaa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入韩嫣的比赛名次");
        int mingci = input.nextInt();
        switch (mingci) {
            case 1:
                System.out.println("参加麻省理工大学组织的1个月夏令营");
                break;
            case 2:
                System.out.println("奖励惠普笔记本一台");
                break;
            case 3:
                System.out.println("奖励移动硬盘一个");
                break;
            default:
                System.out.println("没有任何奖励");
        }
    }
}
