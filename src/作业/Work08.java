package 作业;

import java.util.Scanner;

public class Work08 {
    /**
     * 输入小明成绩，显示所获奖励,成绩==100分，想干啥就啥,成绩>=90,
     * 看电视、吃零食,90>成绩>=60，看书，写作业，成绩<60，做家务、洗碗、拖地。
     */
    /*if (sc.hasNextInt()) {
        int score = sc.nextInt(); ;   //分数*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入小明的成绩:");
        if (input.hasNextInt()) {//只能输出分数
            int score = input.nextInt();
            if  (score == 100){
                System.out.println("想干啥就干啥");
            }else if(score >= 90){
                System.out.println("看电视吃零食");
            }else if(score < 90 && score>= 60){
                System.out.println("看书写作业");
            }else{
                System.out.println("做家务,洗碗拖地!!");
            }
        }else{
            System.out.println("请输入正确的阿拉伯数字!");
        }


    }
}
