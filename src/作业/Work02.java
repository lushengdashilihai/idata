package 作业;

import java.util.Scanner;

public class Work02 {
    public static void main(String[] args) {
        /**
         * 假如你准备去海南旅游，现在要在网上订购机票。机票的价格受季节影响、
         * 而且头等舱、商务舱、经济舱价格也不同。假设机票原价为5000元, 4~10月为旺季，
         * 旺季头等舱9折，商务舱8折、经济舱7折，其也月份为淡季，淡季头等舱5折，商务舱4折、经济舱3折。
         * 请编写Java程序，根据出行的月份和选择的舱位输出实际的机票价格。
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份:");
        int month = sc.nextInt();
        System.out.println("请输入头等舱或者头等舱还是经济舱,头等舱为1,商务舱为2,经济舱为3:");
        int cang = sc.nextInt();
        double qian = 5000;
        double qian1 = 0;
        if (month >= 4 && month <= 10) {
            if (cang == 1) {
                qian1 = qian * 0.9;
            } else if (cang == 2) {
                qian1 = qian * 0.8;
            } else if (cang == 3) {
                qian1 = qian * 0.7;
            }
        } else if ((month >= 1 && month <= 3) || (month == 11 || month == 12)) {
            if (cang == 1) {
                qian1 = qian * 0.5;
            } else if (cang == 2) {
                qian1 = qian * 0.4;
            } else if (cang == 3) {
                qian1 = qian * 0.3;
            }
        }
        System.out.println("机票价格为" + qian1);

    }
}
