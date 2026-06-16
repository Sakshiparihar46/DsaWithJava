package DynamicProgramming;

public class DP9 {
    public static int longestCommonSubstring(String str1,String str2,int n,int m){
        int ans=0;
        int dp[][]=new int[n+1][m+1];
        int maxVal=0;
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                    maxVal=Math.max(dp[i][j],maxVal);
                }else{
                    dp[i][j]=0;

                }
            }
        }
        return maxVal;
    } 

    public static void main(String[] args) {
        String str1="ABCDE";
        String str2="ABCCE";
        int n=str1.length();
        int m=str2.length();
        System.out.println(longestCommonSubstring(str1, str2, n, m));
    }
}
