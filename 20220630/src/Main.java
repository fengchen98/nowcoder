import java.util.Scanner;

/**
 * @author FengChen
 * @description:
 * @date 2022/6/30 21:11
 * @version：1.0
 */
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int ajianb=scanner.nextInt();
//        int bjianc=scanner.nextInt();
//        int ajiab=scanner.nextInt();
//        int bjiac=scanner.nextInt();
//        int a=(ajiab+ajianb)/2;
//        int b=(bjiac+bjianc)/2;
//        int c=bjiac-b;
//        if ((bjianc+bjiac)/2!=(ajiab-ajianb)/2){
//            System.out.println("no");
//        }else {
//            System.out.print(a+" "+b+" "+c);
//        }
//    }
//}


public class Main{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int jinzhi=scanner.nextInt();
        StringBuffer stringBuffer=new StringBuffer();
        while (num>0){
            stringBuffer.append(num%jinzhi);
            num/=jinzhi;
        }
        System.out.println(stringBuffer.reverse().toString());

    }
}