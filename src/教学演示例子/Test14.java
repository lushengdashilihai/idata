package com.kgc;

import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入您的考试成绩：");
        int score = input.nextInt();
/*  二选一
      if(条件表达式){
       执行代码块 1
      }else{
       执行代码块 2
      }
* */
        if (score>90) {
            System.out.println("奖励您一部小天才电话手表");
        }else{
                System.out.println("回家继续写作业");
            }
    }
}
