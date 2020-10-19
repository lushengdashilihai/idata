package 作业;

import java.util.Scanner;

public class Work10 {
    public static void main(String[] args) {
        //1、输入3个班，每班5个学生的成绩，求每个班的总分、平均分、最高分、最低分。
        Scanner input = new Scanner(System.in);
        int totalScore = 0; //总分
        int lowestScore = 0;//最低分
        int topScore = 0;//最高分
        for (int i = 0; i < 3; i++) {
            System.out.println("第" + (i + 1) + "个班级");
            for (int j = 1; j <= 5; j++) {
                System.out.println("第" + j + "个同学的同学的成绩是");
                int num = input.nextInt();
                totalScore = totalScore + num;
                if (topScore < num) {
                    topScore = num;
                    lowestScore = topScore;
                }
                if (lowestScore > num) {
                    lowestScore = num;
                }
            }
            System.out.println("最大值+" + topScore);
            System.out.println("最小值为:" + lowestScore);
            System.out.println("总分为" + totalScore);
            System.out.println("平均分为" + totalScore / 5);
            ;
        }
    }
}
