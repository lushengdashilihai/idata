package 选择结构与循环结构;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        /**********************************************
         * 1.岳小鹏参加Java考试,他和他的父亲岳不群达成一致承诺:
         * 如果:
         * 成绩为100分的时候,奖励BMW;
         * 当成绩为(80-99)时,奖励IPad;
         * 其他情况时,什么奖励都没有.
         * 请从键盘输入岳小鹏的期末考试成绩,并加以判断.
         **********************************************/
        Scanner sc = new Scanner(System.in);  //获取键盘输入的数据
        System.out.println("请输入岳小鹏的考试成绩:");

        if (sc.hasNextInt()) {
            int score = sc.nextInt(); ;   //分数
            if (score == 100) {
                System.out.println("奖励BMW");
            } else if (score >= 80 && score <= 99) {
                System.out.println("奖励Ipad");
            } else if (score < 80) {
                System.out.println("没有任何奖励");
            }
        }else{
            System.out.println("输入超出范围,请输入正确的数字!:");
        }


    }


}


