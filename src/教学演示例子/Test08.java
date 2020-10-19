package com.kgc;

import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        int cardNo; // 声明会员卡号
        Scanner input = new Scanner(System.in);//接收键盘输入
        System.out.println("请您输入4位会员卡号：");  //提示输入会员卡号
        cardNo = input.nextInt(); //获取键盘输入的会员卡号
        //获取每位数字
        int gewei = cardNo % 10 ; //分解获取个位数
        int shiwei = cardNo / 10 % 10;//分解获取十位数
        int baiwei = cardNo / 100 % 10;//分解获取百位数
        int qianwei = cardNo /1000; //分解获取千位

        int sum = gewei+shiwei+baiwei+qianwei;  //求和
        System.out.println("会员卡号："+cardNo+"各位之和："+sum);
        boolean isLuck = sum > 20;//判断和是否>20 如果大于返回true 否则flase
        System.out.println("您是幸运用户吗？"+isLuck);
    }
}
