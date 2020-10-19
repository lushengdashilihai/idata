package 数组;

public class Test13 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int a = 10;
        int b = 0;
        int c = arr.length - 1;
        int d = -1;
        boolean f = false;
        do {
            b = (b + c) / 2;
            if (arr[d] == a) {
                System.out.println("恭喜您,找到这个数,其下标为" + d);
                f = true;
                break;


            } else if (arr[d] > a) {
                c = d - 1;
            } else {
                b = d + 1;
            }
        }while (b<=c);


    }
}