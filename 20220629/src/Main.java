import java.util.Scanner;

/**
 * @author FengChen
 * @description:
 * @date 2022/6/28 22:05
 * @version：1.0
 */
//在字符串中找出连续最长的数字串
    //输入：abcd12345ed125ss123456789
    //输出：123456789
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        char[] chars=str.toCharArray();
        int res=0;
        String result="";
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]-'0'>=0 && chars[i]-'0'<=9){
                int j=i+1;
                while (j<chars.length && chars[j]>=48 && chars[j]<=57){
                    j++;
                }
                res=Math.max(res,j-i);
                if (res==j-i){
                    result=getStr(chars,i,j).toString();
                }
            }
        }
        System.out.println(result);
    }


    public static StringBuffer getStr(char[] chars,int i,int j){
        StringBuffer stringBuffer=new StringBuffer();
        for (; i < j; i++) {
            stringBuffer.append(chars[i]);
        }
        return stringBuffer;
    }
}
