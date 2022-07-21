import java.util.HashMap;
import java.util.Scanner;

/**
 * @author FengChen
 * @description:
 * @date 2022/7/21 21:59
 * @version：1.0
 */
public class Main {
    public static void main1(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();
            int power=scanner.nextInt();
            System.out.println(daguai(n, power));
        }

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        boolean flag=false;
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
                System.out.println(str.charAt(i));
                flag=true;
            }
        }
        if (flag==false){
            System.out.println("-1");
        }
    }
    public static int daguai(int n,int power){
        Scanner scanner=new Scanner(System.in);
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (power>=arr[i]){
                power+=arr[i];
            }else {
                power+=maxNum(power,arr[i]);
            }
        }
        return power;
    }


    public static int maxNum(int num1,int num2){
        int min=Math.min(num1,num2);
        int max=Math.max(num1,num2);

        for (int i = min; i >0 ; i--) {
            if (max%i==0 && min%i==0){
                return i;
            }
        }
        return 1;
    }


    public static int gcd(int a,int b){
        if (a<b){
            int temp=a;
            a=b;
            b=temp;
        }
        return b==0?a:gcd(b,a-b);
    }


}
