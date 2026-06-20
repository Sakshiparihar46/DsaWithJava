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
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3};
        // System.out.println(mcm(arr, 1, arr.length-1));
        int dp[][]=new int[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            Arrays.fill(dp[i],-1);
        }
        System.out.println(mcm1(arr, 1, arr.length-1,dp));
    }
}
