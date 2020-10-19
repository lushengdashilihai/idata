package 作业;

public class Work14linxin {

    public static void main(String[] args) {
        //使用双重循环根据用户输入的数字，输出如下图形
        for (int i = 1; i <= 8; i++) {

            for (int k = 1; k <= 8 - i; k++) {
                System.out.print(" ");
            }
            //
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        for (int i = 7; i >= 1; i--) {

            for (int k = 1; k <= 8 - i; k++) {
                System.out.print(" ");
            }
            //
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}