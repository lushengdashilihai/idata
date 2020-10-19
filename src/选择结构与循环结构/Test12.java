package 选择结构与循环结构;

public class Test12 {
    public static void main(String[] args) {
        //打印乘法口诀表
        int i, j;   //循环变量

        for (i = 1; i <= 9; i++) {
            for (j = 1; j <= i; j++) {

                System.out.print(j + "*" + i + "=" + (i * j) + "\t");
            }
            System.out.println(); //换行
        }
    }
}
