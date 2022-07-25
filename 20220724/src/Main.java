import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author FengChen
 * @description:
 * @date 2022/7/24 16:32
 * @version：1.0
 */

class Node{
    int x;
    int y;
    public Node(int x,int y){
        this.x=x;
        this.y=y;
    }
}
//迷宫问题，求出最短路径
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int[][] arr=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j]=scanner.nextInt();
            }
        }
        ArrayList<Node> path=new ArrayList<>();
        ArrayList<Node> minPath=new ArrayList<>();
        int[][] book=new int[n][m];
        getMinPath(arr,n,m,0,0,book,path,minPath);
        for (Node node:minPath) {
            System.out.println("("+node.x+","+node.y+")");
        }
        /*int[][] dp=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j]==0){
                    if (i==0 && j==0){
                        dp[i][j]=1;
                    }else if (i==0){
                        if (dp[i][j-1]==Integer.MAX_VALUE){
                            dp[i][j]=Integer.MAX_VALUE;
                        }else {
                            dp[i][j]=dp[i][j-1]+1;
                        }
                    }else if (j==0){
                        if (dp[i-1][j]==Integer.MAX_VALUE){
                            dp[i][j]=Integer.MAX_VALUE;
                        }else {
                            dp[i][j] = dp[i - 1][j] + 1;
                        }
                    }else {
                        if (dp[i-1][j]!=Integer.MAX_VALUE && dp[i][j-1]!=Integer.MAX_VALUE){
                            dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1])+1;
                        }else if (dp[i-1][j]!=Integer.MAX_VALUE && dp[i][j-1]==Integer.MAX_VALUE){
                            dp[i][j]=dp[i-1][j]+1;
                        }else if (dp[i-1][j]==Integer.MAX_VALUE && dp[i][j-1]!=Integer.MAX_VALUE){
                            dp[i][j]=dp[i][j-1]+1;
                        }else {
                            dp[i][j]=Integer.MAX_VALUE;
                        }
                    }
                }else {
                    dp[i][j]=Integer.MAX_VALUE;
                }
            }

        }*/


    }
    public static void getMinPath(int[][] arr,int i,int j,int x,int y,int[][] book,ArrayList<Node>path,ArrayList<Node>minPath){
       if (x<0 || x>=i || y<0 || y>=j || book[x][y]==1 || arr[x][y]==1){
           return;
       }
       path.add(new Node(x,y));
       book[x][y]=1;
       if (x==i-1 && y==j-1){
           if (minPath.isEmpty() || path.size()<minPath.size()){
               minPath.clear();
               for (Node node:path){
                   minPath.add(node);
               }
           }
       }
       getMinPath(arr,i,j,x+1,y,book,path,minPath);
       getMinPath(arr,i,j,x-1,y,book,path,minPath);
       getMinPath(arr,i,j,x,y-1,book,path,minPath);
       getMinPath(arr,i,j,x,y+1,book,path,minPath);
       path.remove(path.size()-1);
       book[x][y]=0;
    }
}
