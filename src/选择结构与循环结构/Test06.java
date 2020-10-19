package 选择结构与循环结构;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        /*学校举行运动会,百米赛跑跑入10秒内的学生有资格进决赛,
        根据性别分别进入男子组与女子组.*/
        Scanner input = new Scanner(System.in);
        System.out.println("请输入成绩");
        int score = input.nextInt();
        if (score < 10) {
            System.out.println("请输入您的性别:");
            String sex = input.next();
            if (sex.equals("男") || sex.equals("女")) {
                if (sex.equals("男")) {
                    System.out.println("恭喜您进入男子组决赛!");
                } else if (sex.equals("女")) {
                    System.out.println("恭喜您进入女子组决赛!");
                }
            } else {
                System.out.println("你是呆逼");
            }
        } else {
            System.out.println("很遗憾,您没能进入决赛!");
        }

    }
}
