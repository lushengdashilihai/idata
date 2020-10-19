package 数组;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        int[] list = new int[]{8, 4, 2, 1, 23, 344, 12};
        int sum = 0;
        for (int num : list) {
            System.out.println(num);
            sum += num;
        }
        System.out.println("所列所有数组的和为:" + sum);
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数:" );
        int guess = input.nextInt();
        boolean flag = false;
        for (int num : list){
            if (num == guess){
                flag = true;
                break;
            }
        }if (flag){
            System.out.println("恭喜您,次数列中包含这个数");
        }else{
            System.out.println("抱歉,此数列中不包含这个数");
        }
    }



}
