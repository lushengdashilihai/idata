package com.kgc;

import java.util.Scanner;

public class Test18 {
    /*韩嫣参加计算机编程大赛
    如果第一名，参加麻省理工大学组织的1个月夏令营
    如果第二名，奖励惠普笔记本电脑一部
    如果第三名，奖励移动硬盘一个
    否则，不给任何奖励*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入韩嫣的比赛名次：");
        int mingci = input.nextInt();
        switch (mingci){
            case 1:
                System.out.println("参加麻省理工大学组织的1个月夏令营");
                break;
            case 2:
                System.out.println("奖励惠普笔记本电脑一部");
                break;
            case 3:
                System.out.println("奖励移动硬盘一个");
                break;
            default:
                System.out.println("没有任何奖励");
        }
    }
}
