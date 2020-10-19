package 选择结构与循环结构;

public class Test11 {
    public static void main(String[] args) {
        //打印矩形
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //打印平行四边形
        //输出一行空格 + *
        for (int i = 1; i <= 5; i++) {
            //输出每行里面的空格
            /* 行    空格  5-i
             *  1      4
             *  2      3
             *  3      2
             *  4      1
             *  5      0
             * */
            for (int k=0;k <= 5-i;k++){
                System.out.print(" ");
            }
            //输出每行里面的 5 列 *
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }//换到下一行
            System.out.println();
        }

        //打印等腰三角形
        for (int i = 1; i <= 5; i++) {

            for (int k=1;k <= 5-i;k++){
                System.out.print(" ");
            }
            //输出每行里面的* 2*i-1
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
