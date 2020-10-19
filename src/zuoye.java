

public class zuoye {
    public static void main(String[] args) {
        int[][] a = {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
        System.out.println("数组中的内容为：");
        int sum=0,sum1 = 0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        for(int i=0;i<a.length;i++){
            int n=0;
            sum1=0;
            for(int j=0;j<a[i].length;j++) {
                sum1+=a[i][j];
                n++;
                sum+=a[i][j];
            }
            System.out.println("第"+(i+1)+"季度为："+sum1);
        }
        System.out.println("这家公司的年收入总和为："+sum);
    }
        }

