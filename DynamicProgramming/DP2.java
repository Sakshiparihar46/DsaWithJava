package DynamicProgramming;
import java.util.*;
public class DP2 {
    //recursion
    public static int ways(int n){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        return ways(n-1)+ways(n-2);
    }

    //dynamic programming(memoization)
    public static int ways2(int n,int w[]){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(w[n]==-1){
            w[n]= ways2(n-1,w)+ways2(n-2,w);
        }

        return w[n];
    } 

    //tabulation
    public static int ways3(int n){
          int dp[]=new int[n+1];
          dp[0]=1;

          for(int i=1;i<=n;i++){
            if(i==1){
                dp[i]=dp[i-1]+0;
            }else{
                dp[i]=dp[i-1]+dp[i-2];
            }
          }
          return dp[n];
    }

    public static void main(String args[]){
        int n=5;
        // System.out.println(ways(n));


        int ways[]=new int [n+1];
        Arrays.fill(ways,-1);
        System.out.println(ways2(n, ways));

        System.out.println(ways3(n));
    }
}
