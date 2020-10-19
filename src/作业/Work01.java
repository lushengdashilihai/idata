package 作业;

import java.util.Scanner;

public class Work01 {
    /*Monday 周一
    Tuesday  周二
    Wednesday  周三
    Thursday 周四
    Friday 周五
    Saturday 周六
    Sunday 周日 */
    public static void main(String[] args) {
        /**
         * 1、请根据英文单词的第一个字母判断星期几，如果第一个字母一样，
         * 则继续判断第二个字母。例如：如果第一个字母S，
         * 则继续判读第二个字母，如果第二个字母是a,则输出“星期六”。
         */
        Scanner sc = new Scanner(System.in);
        String day = sc.next();
        char i = day.charAt(0);
        System.out.println("请输入第一个字母:");
        switch (i) {
            case 'M':
                System.out.println("星期一");
                break;
            case 'W':
                System.out.println("星期三");
                break;
            case 'F':
                System.out.println("星期五");
                break;
            case 'T':
                System.out.println("请输入第二个数字");
                String second = sc.next();
                char j = second.charAt(0);
                if (j == 'u') {
                    System.out.println("星期二");
                } else if (j == 'h') {
                    System.out.println("星期四");
                } else {
                    System.out.println("请输入有效的字符");
                }
                break;
            case 'S':

                System.out.println("请输入第二个数字");
                String second2 = sc.next();
                char z = second2.charAt(0);
                if (z == 'a') {
                    System.out.println("星期六");
                } else if (z == 'h') {
                    System.out.println("星期天");
                } else {
                    System.out.println("请输入有效的字符");
                }
                break;
            default:
                System.out.println("请输入有效数字");
                break;
        }

    }
}
