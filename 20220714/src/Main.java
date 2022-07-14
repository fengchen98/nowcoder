import java.util.Scanner;

/**
 * @author FengChen
 * @description:
 * @date 2022/7/14 21:25
 * @version：1.0
 */
public class Main {

    /*以上三角形的数阵，第一行只有一个数1，以下每行的每个数，是恰好是它上面的数、左上角数和右上角的数，3个数之和
    （如果不存在某个数，认为该数就是0）。

    求第n行第一个偶数出现的位置。如果没有偶数，则输出-1。例如输入3,则输出2，输入4则输出3，输入2则输出-1。*/
        public static void main1(String[] args) {
            Scanner in = new Scanner(System.in);
            while (in.hasNextInt()) {
                int num = in.nextInt();
                if(num == 1 || num == 2){
                    System.out.println(-1);
                    continue;
                }
                else if(num % 4 == 1 || num % 4 == 3){
                    System.out.println(2);
                    continue;
                }
                else if(num % 4 == 0){
                    System.out.println(3);
                    continue;
                }
                else if(num % 4 == 2){
                    System.out.println(4);
                    continue;
                }
            }
        }

   /* 写出一个程序，接受一个由字母、数字和空格组成的字符串，和一个字符，然后输出输入字符串中该字符的出现次数。（不区分大小写字母）*/

   public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       String str=scanner.next().toLowerCase();
       char[] chars = scanner.next().toLowerCase().toCharArray();
       char ch=chars[0];
       int count=0;
       for (int i = 0; i < str.length(); i++) {
           if (str.charAt(i)==ch){
               count++;
           }
       }
       System.out.println(count);
   }
}
