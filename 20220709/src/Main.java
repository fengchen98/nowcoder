import java.util.Scanner;

/**
 * @author FengChen
 * @description:
 * @date 2022/7/9 23:09
 * @version：1.0
 */
//public class Main {
//    //任意一个偶数都可以由两个素数组成，求两个素数差值最小的素数对
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int num=scanner.nextInt();
//        int mid=num/2;
//        for (int i = mid; i >0 ; i--) {
//            if (isPrime(i) && isPrime(num-i)){
//                System.out.println(i);
//                System.out.println(num-i);
//                break;
//            }
//        }
//    }
//
//    public static boolean isPrime(int num){
//        for (int i = 2; i <=Math.sqrt(num) ; i++) {
//            if (num%i==0){
//                return false;
//            }
//        }
//        return true;
//    }
//}

public class Main{
    public static void main(String[] args) {
        System.out.println(binInsert(1024,19,2,6));

    }

    public static int binInsert(int n, int m, int j, int i) {
        String strn=Integer.toBinaryString(n);
        String strm=Integer.toBinaryString(m);
        StringBuffer sb=new StringBuffer();
        sb.append(strn.substring(0,strn.length()-i-1)).append(strm).append(strn.substring(strn.length()-j,strn.length()));
        char[] chars=sb.toString().toCharArray();
        int res=0;
        for (int k = 0; k < chars.length; k++) {
            res=res*2+chars[k]-'0';
        }
       return res;


    }

}
