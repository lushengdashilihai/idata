package 数组;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        double[] scores = new double[3]; //声明数组类型   分配数组空间
        double avg = 0;
        double sum = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i + 1) + "位同学的JAVA成绩:");
            scores[i] = input.nextDouble();
            sum += scores[i];

        }
        avg = sum / scores.length;
        System.out.println("张浩班级的同学的JAVA成绩平均分是:" + avg);
    }
}
