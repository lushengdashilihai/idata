package 数组;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        //java考试结束后,老师给张浩分配了一项任务
        //让他计算全班(30人)java课程考试的平均分
        int score = 0;
        double avg = 0;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 30; i++) {
            System.out.println("请输入第" + i + "位同学的java成绩:");
            score = input.nextInt();

        }
    }
}
