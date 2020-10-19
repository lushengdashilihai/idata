package com.kgc;

import java.util.Scanner;

public class Test12_if {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入您的成绩：");
        int score = input.nextInt();
        if(score>90){
            System.out.println("成绩大于90分，奖励iphone手表");
        }
        System.out.println("成绩不大于90分");
    }

}
