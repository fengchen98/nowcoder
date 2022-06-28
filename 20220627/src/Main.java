import java.util.*;

/**
 * @author FengChen
 * @description:
 * @date 2022/6/27 22:32
 * @version：1.0
 */
/*
 输入两个字符串，从第一个字符串中删除第二个字符串中所包含的所有字符
 示例：
 输入：
 They are students.
 aeiou
 输出：
 Thy r stdnts.
 */
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String sb1=sc.nextLine();
//        String sb2=sc.nextLine();
//        Set<Character> set=new HashSet<>();
//        for (int i = 0; i < sb2.length(); i++) {
//            set.add(sb2.charAt(i));
//        }
//        StringBuffer res=new StringBuffer();
//        for(int i=0;i<sb1.length();i++){
//            if(!set.contains(sb1.charAt(i)) || sb1.charAt(i)==' '){
//                res.append(sb1.charAt(i));
//            }
//        }
//        System.out.println(res.toString());
//    }
//}

    /*
    牛牛举办了一个编程比赛，参加比赛的有3*n个选手，使所有队伍的水平值总和最大
    链接：https://www.nowcoder.com/questionTerminal/248ccf8b479c49a98790db17251e39bb?answerType=1&f=discussion
     */
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] num=new int[3*n];
        for (int i = 0; i < num.length; i++) {
            num[i]=sc.nextInt();
        }
        Arrays.sort(num);
        long res=0;
        for (int i = 0; i < n; i++) {
            res+=num[num.length-2*(i+1)];
        }
        System.out.println(res);

    }


}
