package 选择结构与循环结构;

public class Test09 {
    public static void main(String[] args) {
        int sum = 0;
        int num = 2;
        while (num <= 100) {
            sum = sum + num;
            num = num + 2;
        }
        System.out.println("100以内的偶数和是:" + sum);
    }

}
