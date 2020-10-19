package 作业;

import java.util.Scanner;

public class Work03 {
    public static void main(String[] args) {
        //输入一个月份 ，判断月份属于哪一个季节 ：
        // 春天:3,4,5、
        // 夏天 ：6，7，8
        // 秋天:9,10,11
        // 冬天：12，1，2

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份:");
        char i =sc.next().charAt(0);
        switch (i) {
            case 3:
            case 4:
            case 5:
                System.out.println("春天");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏天");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋天");
            case 12:
            case 1:
            case 2:
                System.out.println("冬天");
            default:
                break;
        }
    }
}
