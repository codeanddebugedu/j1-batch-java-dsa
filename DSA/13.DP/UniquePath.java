class UniquePath {
    public int uniquePaths(int m, int n) {
        // Create a 2D array to store the number of paths to each cell
        int[][] dp = new int[m][n];
        
        // Initialize the starting cell
        dp[0][0] = 1;
        
        // Fill in the first row (only one way to get to any cell in the first row)
        for (int j = 1; j < n; j++) {
            dp[0][j] = 1;
        }
        
        // Fill in the first column (only one way to get to any cell in the first column)
        for (int i = 1; i < m; i++) {
            dp[i][0] = 1;
        }
        
        // Fill in the rest of the grid
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        
        // The result is in the bottom-right cell
        return dp[m - 1][n - 1];
    }
}