package com.kgc;

import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
       /* Scanner input = new Scanner(System.in);
        System.out.println("请输入您的考试成绩：");
        int score = input.nextInt();

        if(score>90){
            System.out.println("优秀");
        } else if (score>=80){
            System.out.println("良好");
        }else if (score >= 60){
            System.out.println("中等");
        }else {
            System.out.println("差");
        }*/
        Scanner input = new Scanner(System.in);
        System.out.println("请输入您的年龄：");
        int age=input.nextInt();
        //条件表达式（布尔表达式）（关系表达式或逻辑表达式）、布尔变量 true false
        //语句块只有一条执行代码块时，一对{}可以省略的，但是建议最好不要省略
        //if-else语句结构，根据需要可以嵌套使用
        //当if-else结构是“N选一”时，最后的else可以省略也可以不省略
        //当多个条件“互斥”关系时，条件判断语句及执行语句之间的顺序是无所谓
        //当多个条件“包含”关系时，“小上大下/子上父下”
    /*  N选一
      if(条件表达式){
        执行代码块 1
      }else if(条件表达式){
        执行代码块 2
      }else if(条件表达式){
        执行代码块 3
      }else if(条件表达式){
        执行代码块 4
      }
      ...
      else{
       执行代码块 N
      }
* */

        if(age < 0){
            System.out.println("您输入的年龄不正确，请重新输入！");
        }else if(age < 18){
            System.out.println("青少年时期");
        }else if(age < 35){
            System.out.println("青壮年时期");
        }else if(age < 60){
            System.out.println("中年时期");
        }else if(age < 100){
            System.out.println("老年时期");
        }else{
            System.out.println("恭喜您成仙了！");
        }

         /* Scanner input = new Scanner(System.in);
        System.out.println("请输入您的年龄：");
        String age ;
        在Java中经常会用到Scanner从控制台输入，
        有的时候就会需求判断从控制台输入的数据是否为某种类型，
        最常用的判断为输入的是否为数字，这个时候就需要用到hasNextInt()方法了。
        if(input.hasNextInt()){
            age=input.next();
            System.out.println("你输入的是数字");
        }else {
            age=input.next();
            System.out.println("请输入正确的数字");
        }*/
    }
}
