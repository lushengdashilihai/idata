package 作业;

public class Work11 {
    //3、判断1-100之间有多少个质数并输出所有质数。
    //质数又称素数，指整数在一个大于1的自然数中，除了1和此整数自身外，没法被其他自然数整除的数。
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i <=100; i++) {//1不是指数,直接从2开始.
            int j = 2;
            for ( j = 2; j <= i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (i == j) {
                System.out.println(i+"\t");
                count++;
                if (count % 8 == 0){
                    System.out.println();
                }
            }
        }
    }
}
