import java.util.Scanner;

/**
 * @author FengChen
 * @description:
 * @date 2022/7/17 17:53
 * @version：1.0
 */
public class Main {
    //有一种兔子，从出生后的第三个月起每个月就会生一只兔子，小兔子长到第三个月后每个月又会生一只兔子
    public static void main1(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(countNum(n));
    }

    public static int countNum(int n){
        int count=0;
        int first=1;
        int sencond=1;
        for (int i = 3; i <=n ; i++) {
            count=first+sencond;
            first=sencond;
            sencond=count;
        }

        return count;
    }


    //拿空瓶子兑换汽水瓶，最多能和几瓶饮料
    public static void main2(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int count=0;
            int n=scanner.nextInt();
            if (n==0){
                break;
            }
            if (n<3){
                System.out.println("0");
                continue;
            }
            while (n>1){
                count+=n/3;
                n=n/3+n%3;
                if (n==2){
                    count++;
                    break;
                }
            }
            System.out.println(count);

        }
    }

//    查找两个字符串a,b中的最长公共子串。若有多个，输出在较短串中最先出现的那个。
//    注：子串的定义：将一个字符串删去前缀和后缀（也可以不删）形成的字符串。请和“子序列”的概念分开！
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str1=scanner.nextLine();
        String str2=scanner.nextLine();
        if (str1.length() > str2.length()) {
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }
        int m=str1.length()+1;
        int n=str2.length()+1;
        int maxlen=0;
        int start=0;
        int[][] max=new int[m][n];
        for (int i = 1; i <m; i++) {
            for (int j = 1; j <n; j++) {
                if (str1.charAt(i-1) == str2.charAt(j-1)){
                    max[i][j]=max[i-1][j-1]+1;
                    if (maxlen<max[i][j]){
                        maxlen=max[i][j];
                        start=i-maxlen;
                    }
                }
            }
        }
        System.out.println(str1.substring(start,start+maxlen));

    }
}
