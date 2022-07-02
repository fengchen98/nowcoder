import java.util.Scanner;

/**
 * @author FengChen
 * @description:
 * @date 2022/6/30 22:01
 * @version：1.0
 */
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        String str1=scanner.nextLine();
//        String str2=scanner.nextLine();
//        int count=0;
//        for (int i = 0; i < str1.length(); i++) {
//            StringBuffer stringBuffer=new StringBuffer(str1);
//            stringBuffer.insert(i,str2);
//            StringBuffer temp=new StringBuffer(stringBuffer);
//
//            StringBuffer str=temp.reverse();
//            if (stringBuffer.toString().equals(str.toString())){
//                count++;
//            }
//
//        }
//        System.out.println(count);
//    }
//
//
//}


public class Main{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextInt();
        }
        int[] dp=new int[n];
        dp[0]=arr[0];
        int max=dp[0];
        for (int i = 1; i < n; i++) {
            dp[i]=Math.max(dp[i-1]+arr[i],arr[i]);
            max=Math.max(max,dp[i]);
        }
        System.out.println(max);
    }
}