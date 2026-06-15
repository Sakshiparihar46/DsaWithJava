package DynamicProgramming;
public class DP8 {
    //recursion
    public static int lcs(String str1,String str2,int n,int m){
        if(n==0 || m==0){
            return 0;
        }
        if(str1.charAt(n-1)==str2.charAt(m-1)){//same
            return lcs(str1,str2,n-1,m-1)+1;
        }else{//for in different cases
            int ans1=lcs(str1, str2,n-1, m);
            int ans2=lcs(str1, str2,n, m-1);
            return Math.max(ans1, ans2);
        }
    }

    //memoization
    public static int lcs1(String str1,String str2,int n,int m,int dp[][]){
        if(n==0 || m==0){
            return 0;
        }

        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        if(str1.charAt(n-1)==str2.charAt(m-1)){//same
            dp[n][m]=lcs1(str1,str2,n-1,m-1,dp)+1;
            return dp[n][m];
        }else{//for in different cases
            int ans1=lcs1(str1, str2,n-1, m,dp);
            int ans2=lcs1(str1, str2,n, m-1,dp);
            dp[n][m]= Math.max(ans1, ans2);
            return dp[n][m];
        }
    }


    public static void main(String[] args) {
        String str1="abcdge";
        String str2="abedg";
        int n=str1.length();
        int m=str2.length();
        int dp[][]=new int [n+1][m+1];


        // System.out.println(lcs(str1, str2, str1.length(), str2.length()));

        //initialiazation
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < m+1; j++) {
                dp[i][j]=-1;
            }
        }
        System.out.println(lcs1(str1, str2, n, m, dp));

    }
}
