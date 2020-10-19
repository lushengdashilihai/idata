package 数组;

import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入您要的杨辉三角的函数");
        int n =input.nextInt( );
        int[][] arr =  new int[n][n];
        //每行每列数据都是上一行的前一列数据和这一列数据之和
        for (int x = 0; x < arr.length; x++) {
            arr[x][0]=1;
            arr[x][x]=1;
        }
        //每行每列数据都是上一行的前一列数据和这一列数据之和
        for (int x = 0; x < arr.length; x++) {
            for (int y = 1; y <=x-1 ; y++) {
                arr[x][y] = arr[x-1][y-1]+arr[x-1][y];
            }
        }
        //遍历二维数组,跟九九乘法表一样的比拉力方式,右上角不要
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y <=x ; y++) {
                System.out.print(arr[x][y]+"\t");
            }
            System.out.println("    ");
        }input.close();
    }
}
