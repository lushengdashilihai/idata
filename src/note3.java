import java.util.Scanner;

public class note3 {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.print("请输入考生姓名：");
        String name = input.next();

        int score,sum ,avg,max,min;
        score = sum = max = min = 0;
        for (int i = 1; i <= 5 ; i++) {
            System.out.print("请输入第"  + i + "门课程的成绩：");
            score = input.nextInt();
            if(i == 1){
                min = score;
            }
            if(score > max){
                max = score;
            }
            if(score < min){
                min = score;
            }
            sum += score;
        }
        avg = sum / 5;
        System.out.println(name + "平均分是：" + avg + ",总分是："
                + sum + "，最高分是：" + max +",最低分是：" + min);

       /* Scanner input = new Scanner(System.in);
        System.out.print("请输入一个值：");
        int value = input.nextInt();
        System.out.println("根据这个值输出以下加法表：");
        for (int i = 0,j=value; i <= value ; i++,j--) {
            System.out.printf("%d + %d = %d %n",i,j,(i+j));
        }*/

    }
}

