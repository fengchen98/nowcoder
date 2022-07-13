import java.util.Scanner;

/**
 * @author FengChen
 * @description:
 * @date 2022/7/13 21:39
 * @version：1.0
 */
public class Main {
    //数字中包含1的个数
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();
            int count=0;
            for (int i = 0; i < 32; i++) {
                if ((n&1)==1){
                    count++;
                }
                n=n>>1;
            }
            System.out.println(count);

        }
    }

    //完美质约数
    public static void main2(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int res=0;
        for (int i = 1; i < n; i++) {
            if (perfectNum(i)){
                res++;
            }
        }
        System.out.println(res);
    }
    public static boolean perfectNum(int n) {
        int sum=0;
        for (int i = 1; i < n; i++) {
            if (n%i==0){
                sum+=i;
            }
        }
        if (sum==n){
            return true;
        }
        return false;
    }

    /* 扑克牌游戏大家应该都比较熟悉了，一副牌由54张组成，含3~A、2各4张，小王1张，大王1张。牌面从小到大用如下字符和字符串表示（其中，小写joker表示小王，大写JOKER表示大王）：
        3 4 5 6 7 8 9 10 J Q K A 2 joker JOKER
        输入两手牌，两手牌之间用"-"连接，每手牌的每张牌以空格分隔，"-"两边没有空格，如：4 4 4 4-joker JOKER。
        请比较两手牌大小，输出较大的牌，如果不存在比较关系则输出ERROR。
        基本规则：
（1）输入每手牌可能是个子、对子、顺子（连续5张）、三个、炸弹（四个）和对王中的一种，不存在其他情况，由输入保证两手牌都是合法的，顺子已经从小到大排列；
（2）除了炸弹和对王可以和所有牌比较之外，其他类型的牌只能跟相同类型的存在比较关系（如，对子跟对子比较，三个跟三个比较），不考虑拆牌情况（如：将对子拆分成个子）；
（3）大小规则跟大家平时了解的常见规则相同，个子、对子、三个比较牌面大小；顺子比较最小牌大小；炸弹大于前面所有的牌，炸弹之间比较牌面大小；对王是最大的牌；*/
    public static void main3(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        String[] split = str.split("-");
        String[] s1 = split[0].split(" ");
        String[] s2 = split[1].split(" ");
        String p="34567891JQKA2j";
        if (split[0].equals("joker JOKER") || split[1].equals("joker JOKER")){
            System.out.println("joker JOKER");
        }else if (s1.length==s2.length){
            if (split[0].equals("joker")&&split[1].equals("JOKER")){
                System.out.println("JOKER");
            }else if (split[0].equals("JOKER")&&split[1].equals("joker")){
                System.out.println("JOKER");
            }else if (p.indexOf(s1[0].substring(0,1))>p.indexOf(s2[0].substring(0,1))){
                System.out.println(split[0]);
            }else{
                System.out.println(split[1]);
            }
        }else if (s1.length==4){
            System.out.println(split[0]);
        }else  if (s2.length==4){
            System.out.println(split[1]);
        }else {
            System.out.println("ERROR");
        }

    }


}
