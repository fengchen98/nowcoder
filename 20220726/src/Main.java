import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author FengChen
 * @description:
 * @date 2022/7/26 22:12
 * @version：1.0
 */
public class Main {
    //判断是否能构成三角形
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            BigDecimal a=sc.nextBigDecimal();
            BigDecimal b=sc.nextBigDecimal();
            BigDecimal c=sc.nextBigDecimal();
            if(a.add(b).compareTo(c)>0 && a.add(c).compareTo(b)>0 && c.add(b).compareTo(a)>0){
                System.out.println("Yes");
            }else{
                System.out.println("No");

            }
        }


    }
    //不用加减乘除做加法
    public static int Add(int num1,int num2) {
        while (num2!=0){
            int temp=num1^num2;
            num2=(num1&num2)<<1;
            num1=temp;
        }
        return num1;
    }


    public static void main1(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            BigDecimal n=scanner.nextBigDecimal();
            BigDecimal r=scanner.nextBigDecimal();
            BigDecimal res=new BigDecimal(6.28).multiply(r);
            if (n.compareTo(res)==1){
                System.out.println("No");
            }else {
                System.out.println("Yes");
            }
        }

    }


    public static int jumpFloorII (int number) {
        // write code here
        if(number<3){
            return number;
        }
        int[] dp=new int[number+1];
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<number+1;i++){
            dp[i]=2*dp[i-1];
        }
        return dp[number];
    }

}
