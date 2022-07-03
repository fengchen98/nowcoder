import java.util.Scanner;

/**
 * @author FengChen
 * @description:
 * @date 2022/7/2 18:45
 * @version：1.0
 */
public class Main {
    public static void main(String[] args) {

        //有一个w*h的数组，每个位置最多放置一块蛋糕，并且距离他欧几里得距离为2处不能有蛋糕，求出最多能放置几块
//        Scanner scanner=new Scanner(System.in);
//        int w=scanner.nextInt();
//        int h=scanner.nextInt();
//        boolean[][] arr=new boolean[w][h];
//
//        int count=0;
//        for (int i = 0; i < w; i++) {
//            for (int j = 0; j < h; j++) {
//                if (arr[i][j]==false){
//                    count++;
//                    if (i+2<w){
//                        arr[i+2][j]=true;
//                    }
//                    if (j+2<h){
//                        arr[i][j+2]=true;
//                    }
//                }
//            }
//
//        }
//        System.out.println(count);
        System.out.println(StrToInt("+12345"));
    }

    //将一个字符串转换为一个整数
    public static int StrToInt(String str) {
        if(str.length()==0){
            return 0;
        }
        char[] chars=str.toCharArray();
        int sum=0;
        int symbol=1;
        if(chars[0]=='+'){
            chars[0]='0';
        }
        if(chars[0]=='-'){
            chars[0]='0';
            symbol=-1;
        }
        for(int i=0;i<chars.length;i++){
            if(chars[i]<'0' || chars[i]>'9'){
                sum=0;
                break;
            }
            sum=sum*10+chars[i]-'0';
        }
        return symbol*sum;

    }
}
