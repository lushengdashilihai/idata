package 选择结构与循环结构;

import java.util.Scanner;

public class Test07 {
    /*韩嫣参加计算机编程大赛
    如果第一名,参加麻省理工大学注释的1个月夏令营
    如果第二名,奖励惠普笔记本一台
    如果第三名,奖励移动硬盘一个
    否则,不给任何奖励*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入韩嫣的比赛名次");
        int mingci = input.nextInt();
        if (mingci ==1){
            System.out.println("参加麻省理工大学组织的1个月的夏令营");
        } else if (mingci == 2){
            System.out.println("奖励惠普笔记本一台");
        }else if (mingci == 3){
            System.out.println("奖励移动硬盘一个");
        } else {
            System.out.println("没有任何奖励");
        }
    }
}
