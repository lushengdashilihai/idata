package 数组;

import java.util.Arrays;
import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        String[] names = {"Tome", "Jack", "Sam", "Alice", null, "Ruby", "Robin"};
        //接受用户键盘输入
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要删除的人员姓名:");
        String name = input.next();
        int j = -1;
        for (int i = 0; i < names.length; i++) {
            if (name.equalsIgnoreCase(names[i])) {
                names[i]=null;
                String a =input.next();
                names[i] = a;
            }

        }
        System.out.println("j=" + j);
        if (j != -1) {
            for (int i = j; i < names.length-1; i++) {
                names[i] = names[i+1];
            }
            System.out.println(Arrays.toString(names));
            names[names.length-1] = null;

        } else {
            System.out.println("很抱歉,没有你要删除的名字");
        }
        System.out.println("删除后的人员姓名为:");
        for (String item : names) {
            System.out.println(item + "\t");
        }
    }
}
