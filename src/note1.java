import java.util.Scanner;

public class note1 {
    public static void main(String[] args) {
       /* int i=0;//第一要素：循环变量初始化
        while (i<100){//第二要素：循环条件
            System.out.println((i+1)+"HELLO");//第二要素：循环操作
            i++;//第四要素：迭代变量

        } */
      /*  int i = 1;
        int sum = 0;
        while (i <= 100) ;
        {
            sum = sum + i;
            i++;
            System.out.println("SUM" + sum);
        }*/



        int n=3;
        int i=0;
        int pow=1;
        while(i<n){
            pow=pow*2;
            i++;
            System.out.println("结果为:"+pow);
        }



      /* int fac=1;
       int i =1;
       while (i<=5){
          fac=fac*i;
          i++;
       }
      System.out.println("FAC:"+fac);*/

        /*Scanner input=new Scanner(System.in);
        System.out.println("请输入一个大于一的自然数");
        int number = input.nextInt();
        int i = 2;
        boolean isPrime = true;  //标识是否是质数
        while(i < number){
            if(number % i == 0){
                isPrime = false; //表示它不是质数
                break; //跳出整个while循环
            }
            i++;
        }
        if(isPrime){
            System.out.println(number + "是质数");
        }
        else{
            System.out.println(number + "是合数");
        }*/


       /* int i=1;
        while (i<=50){
            System.out.println("正在打印"+i+"分试卷");
            i++;
        }*/


        Scanner input=new Scanner(System.in);
        System.out.println("是否合格(y/n)");
        String reply=input.next();
        while (!"y".equalsIgnoreCase(reply)){
            //equalsIgnoreCase(String)用来比较两个字符串内容是否相等
            //!逻辑与算符     逻辑反 ！true=false    ！false=true
            System.out.println("1,上午阅读材料，学习理论任务");
            System.out.println("2,下午上机编程，掌握代码部分");
            System.out.println("是否合格(y/n)");
            reply=input.next();//迭代变量
        }
        System.out.println("您完成学任务");
    }
}

