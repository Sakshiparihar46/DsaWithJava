package DynamicProgramming;

import java.util.Arrays;

public class DP19 {
    public static int minJumps(int arr[]){
        int n=arr.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        dp[n-1]=0;
        for (int i = n-1; i >=0; i--) {
            int ans=Integer.MAX_VALUE;
            int steps=arr[i];
            for (int j = i+1; j <=i+steps && j<n; j++) {
                if(dp[j]!=-1){
                    ans=Math.min(dp[j]+1,ans);
                }
            }
            if(ans!=Integer.MAX_VALUE){
                dp[i]=ans;
            }
        }
        return dp[0];
    }
    public static void main(String[] args) {
        int arr[]={2,3,1,1,4};
        System.out.println(minJumps(arr));
    }
}
