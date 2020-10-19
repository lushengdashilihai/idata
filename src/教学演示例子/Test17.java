package com.kgc;

import java.util.Scanner;

public class Test17 {
    //学校举行运动会，百米赛跑跑入10 秒内的学生有资格进决赛，
    // 根据性别分别进入男子组和女子组
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入您的比赛成绩：");
        int score = input.nextInt();
        //根据输入的比赛成绩 <10 进入决赛  >10 淘汰了
        if (score < 10){
            System.out.println("请输入您的性别：");
            String sex = input.next();
            //根据性别进行分组
            if (sex.equals("男")){
                System.out.println("恭喜您进入男子组决赛！");
            }else if(sex.equals("女")){
                System.out.println("恭喜您进入女子组决赛！");
            }
        }else{
            System.out.println("很遗憾，您没能进入决赛！");
        }
    }
}
