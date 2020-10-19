package com.kgc;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        //三目运算符（条件运算符）基本语法格式:  条件 ？表达式1 :表达式2
       /* int min;
        min = 5<7?5:7;
        // 当条件为真时返回表达式1
        System.out.println(min);
        min = 10<7?10:7;
        //条件为假时返回表达式2
        System.out.println(min);*/

        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int num = input.nextInt();
        String result = (num%2==0)?"偶数":"奇数";
        System.out.println(num+"是"+result);
    }
}
