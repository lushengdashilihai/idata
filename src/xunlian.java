import java.util.Scanner;

public class xunlian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入三角形的行数:");
        int[][] arr = new int[10][10];
        for (int i = 0; i < arr.length; i++) {

            arr[i][0] = 1;
        }
        for (int j = 1; j < arr.length; j++) {
            for (int k = 1; k < arr.length; k++) {
                arr[k][j] = arr[k - 1][j - 1] + arr[k - 1][j];

            }
        }
        for (int j = 0; j < arr.length; j++) {
            for (int k = arr.length - j; k > 0; k--) {
                System.out.print("  ");
            }
            for (int k = 0; k < arr.length; k++) {
                if (arr[j][k] != 0) {
                    System.out.print(arr[j][k] + "  ");
                }
            }
            System.out.println();
        }
    }
}






