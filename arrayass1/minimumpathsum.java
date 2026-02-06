public class minimumpathsum  {
    public static int minPathSum(int[][] grid) {
        int m = grid.length;       // number of rows
        int n = grid[0].length;    // number of columns

        // Create DP table
        int[][] dp = new int[m][n];

        // Start point
        dp[0][0] = grid[0][0];

        // Fill first row (can only come from left)
        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }

        // Fill first column (can only come from top)
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }

        // Fill the rest of dp table
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }

        // Bottom-right corner has the answer
       return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        int[][] grid = {
            {1, 3, 1},
            {1, 5, 1},
            {4, 2, 1}
        };
       

        System.out.println("Minimum Path Sum = " + minPathSum(grid));
    }
}