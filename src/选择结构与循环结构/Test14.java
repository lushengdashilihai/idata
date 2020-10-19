package 选择结构与循环结构;

public class Test14 {
    public static void main(String[] args) {
       /* //1-10之间的整数相加,得到累加值大于20的当前数
        int sum = 0;
        for (int i = 1; i <=10 ; i++) {

        }*/
        //请实现输出1-10中非4的倍数的数字
       /* for (int i = 1; i <10 ; i++) {
            if(i%4==0){
                continue;
            }
            System.out.println(i+" ");
        }
        System.out.println("循环结束!");*/
        //求1-10之间的所有偶数和
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 1) {
                continue;//如果i为奇数,结束本次循环,进行下一次循环
            }sum+=i;
        }
        System.out.println("1-10之间的偶数之和是:"+sum);
    }
}
