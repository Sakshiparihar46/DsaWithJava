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

    public static void main(String args[]){
        int n=5;
        // System.out.println(ways(n));


        int ways[]=new int [n+1];
        Arrays.fill(ways,-1);
        System.out.println(ways2(n, ways));
    }
}
