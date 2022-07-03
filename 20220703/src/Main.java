import java.util.Scanner;
import java.util.Stack;

/**
 * @author FengChen
 * @description:
 * @date 2022/7/3 22:39
 * @version：1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int f1=0;
        int f2=1;
        while (n>f2){
            int f3=f1+f2;
            f1=f2;
            f2=f3;
        }
        System.out.println(Math.min(n-f1,f2-n));

    }

    public static boolean chkParenthesis(String A, int n) {
        if (n%2!=0){
            return false;
        }

        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i)=='('){
                stack.push(A.charAt(i));
            }else if (A.charAt(i)==')'){
                if (stack.isEmpty()){
                    return false;
                }else if (stack.peek()=='('){
                    stack.pop();
                }
            }else {
                return false;
            }
        }
        return stack.isEmpty();
    }


}
