

public class note2 {
    public static void main(String[] args) {
        /* Scanner input=new Scanner(System.in);
        String answer;
        //do_while 先执行循环操作，然后判断循环条件是否成立，循环条件至少执行一次
       do {
            System.out.println("上机操作编程");
            System.out.println("合格了吗？(y/n)");
            answer=input.next();
        }while (!"y".equalsIgnoreCase(answer));
        System.out.println("测试通过了");*/



        int num = 100;
        int gewei,shiwei,baiwei,sum;
        do{
            gewei = num % 10; //个位
            shiwei = num/10 %10; //十位
            baiwei = num /100 % 10; //百位
            //Math.pow(double a,double b) 方法用于返回第一个参数的第二个参数次方。
            sum = (int)(Math.pow(gewei,3) + Math.pow(shiwei,3) + Math.pow(baiwei,3));
            if(sum == num){
                System.out.println(num + "是水仙花数");
            }
            num++;
        }while(num <= 999);



    }
}
