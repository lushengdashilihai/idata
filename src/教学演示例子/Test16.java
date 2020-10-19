package com.kgc;

public class Test16 {
    //定义三个 int 型变量并赋值，
    // 使用if-else结构获取这三个数中的最大数的实现。
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 21;
        int num3 = -20;
        int max;
        if (num1 >= num2 && num1 >= num3){
            max = num1;
        }else if(num2 >= num1 && num2 >= num3){
            max =num2;
        }else {
            max = num3;
        }
        System.out.println("三个数中最大值是："+max);
    }
}
