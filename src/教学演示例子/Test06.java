package com.kgc;

public class Test06 {
    public static void main(String[] args) {
        String wanghao = "黑桃10";
        String zhangsan = "红桃8";
        System.out.println("转换前的内容是："+"王浩："+wanghao+"张三："+zhangsan);

        String temp;
        temp = wanghao;
        wanghao = zhangsan;
        zhangsan = temp;

        System.out.println("转换后的内容是："+"王浩:"+wanghao+"张三:"+zhangsan);
    }
}
