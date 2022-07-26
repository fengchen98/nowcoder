import java.util.Scanner;

/**
 * @author FengChen
 * @description:
 * @date 2022/7/25 22:57
 * @version：1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String str=scanner.nextLine();
            while (str.length()>1){
                int n=0;
                for(int i=0;i<str.length();i++){
                    n+=str.charAt(i)-'0';
                }
                str=String.valueOf(n);
            }
            System.out.println(str);
        }

    }


}
