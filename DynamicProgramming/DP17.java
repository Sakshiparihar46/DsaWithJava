package DynamicProgramming;
import java.util.Arrays;

public class DP17 {
    public static int mcm(int arr[],int i,int j){
        if(i==j){
            return 0;
        }
        int ans=Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++){
            int cost1=mcm(arr,i,k);
            int cost2=mcm(arr,k+1,j);
            int cost3=arr[i-1]*arr[k]*arr[j];
            int finalCost=cost1+cost2+cost3;
            ans=Math.min(finalCost,ans);
        }
        return ans;
    }

    public static int mcm1(int arr[],int i,int j,int dp[][]){
        if(i==j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int ans=Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++){
            int cost1=mcm1(arr,i,k,dp);
            int cost2=mcm1(arr,k+1,j,dp);
            int cost3=arr[i-1]*arr[k]*arr[j];
            int finalCost=cost1+cost2+cost3;
            ans=Math.min(finalCost,ans);
        }
        dp[i][j]=ans;
        return dp[i][j];
    }
    //tabulation
    public static int mcm3(int arr[]){
        int n=arr.length;
        int dp[][]=new int [n][n];
        for(int i=0;i<arr.length;i++){
            dp[i][i]=0;
        }

        for (int len = 2; len <=n-1; len++) {
            for (int i=1;i<=n-len;i++){
                int j=i+len-1;
                dp[i][j]=Integer.MAX_VALUE;
                for (int k = i; k <=j-1; k++) {
                    int cost1=dp[i][k];
                    int cost2=dp[k+1][j];
                    int cost3=arr[i-1]*arr[k]*arr[j];
                    dp[i][j]=Math.min(cost1+cost2+cost3,dp[i][j]);
                }
            }
        }
        return dp[1][n-1];
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,3};
        // System.out.println(mcm(arr, 1, arr.length-1));
        // int dp[][]=new int[arr.length][arr.length];
        // for (int i = 0; i < arr.length; i++) {
        //     Arrays.fill(dp[i],-1);
        // }
        // System.out.println(mcm1(arr, 1, arr.length-1,dp));

        System.out.println(mcm3(arr));
    }
}
