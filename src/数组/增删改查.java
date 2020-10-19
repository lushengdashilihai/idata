package 数组;

import java.util.Arrays;
import java.util.Scanner;

public class 增删改查 {
    //对数组1、String[]names={"Angelia","Alice","tome","sam","Jack","Ruby",null,"Robin","Anne"};
//进行增操作。

        public static void main(String[] args) {
            String[] names = {"Angelia", "Alice", "tome", "sam", "Jack", "Ruby", "Robin", "Anne"};
            String[] newNames = new String[names.length];
            newNames = Arrays.copyOf(names, names.length + 10);
            Scanner input = new Scanner(System.in);
            boolean f = true;
            while (f) {
                System.out.println("1:增加姓名");
                System.out.println("2:修改姓名");
                System.out.println("3:删除姓名");
                System.out.println("4:查询姓名");
                System.out.println("5:退出");
                System.out.println("------请选择-----");
                int a = input.nextInt();
                switch (a) {
                    case 1:
                        int j = -1;
                        System.out.println("=====请输入添加的姓名======");
                        String name = input.next();
                        for (int i = 0; i < newNames.length; i++) {
                            if (newNames[i] == null) {
                                j = i;
                                break;
                            }

                        }
                        if (j != -1) {
                            newNames[j] = name;
                            System.out.println("添加成功");
                        } else {
                            System.out.println("很抱歉  人员已满");
                        }

                        break;
                    case 2:
                        int b = -1;
                        System.out.println("=====请输入修改的姓名=====");
                        String aname = input.next();
                        System.out.println("请输入新的名字");
                        String sname = input.next();
                        for (int i = 0; i < newNames.length; i++) {
                            if (aname.equals(newNames[i])) {
                                b = i;
                                break;
                            }
                        }
                        if (b != -1) {
                            newNames[b] = sname;
                            System.out.println("修改成功");
                        } else {
                            System.out.println("没有要修改的名字");
                        }

                        break;
                    case 3:
                        int t = -1;
                        System.out.println("=====请输入要删除的名字=====");
                        String qname = input.next();
                        for (int i = 0; i < newNames.length; i++) {
                            if (qname.equals(newNames[i])) {
                                t = i;
                                break;
                            }
                        }
                        if (t != -1) {
                            for (int i = t; i < newNames.length - 1; i++) {
                                newNames[i] = newNames[i + 1];
                            }
                            newNames[newNames.length - 1] = null;
                            System.out.println("删除成功");

                        } else {
                            System.out.println("抱歉 没有该姓名");
                        }

                        break;
                    case 4:
                        System.out.println("=====查询界面=====");
                        System.out.println("序号\t\t姓名");
                        for (int i = 0; i < newNames.length; i++) {
                            if (newNames[i] == null) {
                                break;
                            }

                            System.out.println((i + 1) + "\t\t" + newNames[i]);
                        }

                        break;
                    case 5:
                        System.out.println("感谢使用  再见");
                        f = false;

                        break;
                    default:
                        break;

                }
            }
        }
    }

