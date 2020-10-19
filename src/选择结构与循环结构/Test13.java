package 选择结构与循环结构;

import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        int score;
        int sum = 0;
        int avg;
        boolean isNegative = false;//是否为负数
        Scanner input = new Scanner(System.in);
        System.out.println("请输入学生的姓名:");
        String name = input.next();
        for (int i =1 ; i < 6; i++) {
            System.out.println("请输入第" + i + "门客的成绩");
            score = input.nextInt();
            if (score < 0) {
                isNegative = true;
                break;
            }
            sum += score;

        }
        if (isNegative) {
            System.out.println("抱歉,分数录入错误,请重新输入!:");
        } else {
            avg = sum / 5;
            System.out.println(name + "的平均分是:" + avg);
        }
    }
}
