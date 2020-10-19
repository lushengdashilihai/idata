package com.kgc;

import java.util.Scanner;

public class Test13 {
    //张浩Java成绩大于90分，并且音乐成绩大于80分时，
    // 或者Java成绩等于100分，并且音乐成绩大于70分时，
    // 老师奖励他，该怎么做呢？
    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        System.out.println("请输入您的JAVA成绩：");
        int JScore= input.nextInt();
        System.out.println("请输入您的音乐成绩：");
        int YScore=input.nextInt();
        *//*     if(条件表达式){
                   执行代码块
               }        *//*
        if((JScore>90 && YScore>80) || (JScore == 100 && YScore>70)){
            System.out.println("老师就奖励您放假8天");
        }*/

        Scanner input = new Scanner(System.in);
        System.out.println("请输入您的心跳值：");
        int heartBeats=input.nextInt();

        if(heartBeats < 65 || heartBeats > 100){
            System.out.println("您需要去医院做进一步检查了");
        }

    }
}
