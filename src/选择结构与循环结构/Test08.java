package 选择结构与循环结构;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        String answer;
        Scanner input = new Scanner(System.in);
        System.out.println("学习合格了吗?(y/n)");
        answer = input.next();
        while(!"y".equals(answer)){
            System.out.println("上午阅读教材,学习理论部分");
            System.out.println("下午上级编程");
            System.out.println("学习合格了吗?");
            answer = input.next();
        }
        System.out.println("完成了学习的任务");
    }
 }
