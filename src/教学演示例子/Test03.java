package com.kgc;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("请输入您的姓名：");
//        String name = input.next();

//        System.out.println("您的姓名是："+name+"\n年龄是："+age);


        Scanner input = new Scanner(System.in);
        System.out.println("请输入您的本金：");
        int money = input.nextInt();

        System.out.println("本金："+money);
        System.out.println("活期1年本金总计："+Math.round(money*1.0035));
        System.out.println("定期1年本金总计："+Math.round(money*1.015));
        System.out.println("活期2年本金总计："+Math.round(money*0.0035*2+money));
        System.out.println("定期2年本金总计："+Math.round(money*1.0035));
    }
}
