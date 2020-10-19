package com.kgc;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        //产生随机数Math.random()
        int random = (int)(Math.random()*10);

        System.out.println("请输入4位会员卡号：");
        Scanner input = new Scanner(System.in);
        int cardNo = input.nextInt();

        //分解获取百位数
        int baiwei = cardNo / 100 % 10;

        if (baiwei==random){
            System.out.println("恭喜您中了500万！");
        }else {
            System.out.println("很遗憾，再接再厉！");
        }
    }
}
