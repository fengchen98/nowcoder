
import java.util.Scanner;

/**
 * @author FengChen
 * @description:
 * @date 2022/6/28 9:30
 * @version：1.0
 */

//将一句话的单词进行倒置，标点不倒置。比如 I like beijing. 经过函数后变为：beijing. like I

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] chars=str.toCharArray();
        reverse(chars,0,chars.length-1);
        int i=0;
        while (i<chars.length){
            int j=i;
            while (j<chars.length && chars[j]!=' '){
                j++;
            }
            reverse(chars,i,j-1);
            i=j+1;
        }
        String res=new String(chars);
        System.out.println(res);
    }

    public static void reverse(char[] ch,int i,int j){
        while (i<j) {
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
    }


}


////求出一个整数数组中连续子序列的个数
//public class Main{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] arr=new int[n+1];
//        int count=0;
//        for (int i = 0; i < n; i++) {
//            arr[i]=sc.nextInt();
//        }
//        int i=0;
//
//        while (i<n){
//            if (arr[i]>arr[i+1]){
//                while (i<n && arr[i]>=arr[i+1]){
//                    i++;
//                }
//                count++;
//                i++;
//            }else if (arr[i]==arr[i+1]){
//                i++;
//            }else {
//                while (i<n && arr[i]<=arr[i+1]){
//                    i++;
//                }
//                count++;
//                i++;
//            }
//        }
//        System.out.println(count);
//
//    }
//
//
//}
