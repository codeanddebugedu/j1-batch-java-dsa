class minFallPathSum {
    public int minFallingPathSum(int[][] A) 
    {
        if(A == null || A.length == 0)
            return 0;
        int m=A.length;
        int n=A[0].length;
        int i,j;
        int dp[][]=new int[m][n];
        for(i=0;i<n;i++)
        {
            dp[m-1][i]=A[m-1][i];
        }
        for(i=m-2;i>=0;i--)
        {
            for(j=0;j<n;j++)
            {
                int min=Integer.MAX_VALUE;
                if(j<n-1)
                    min=Math.min(min,dp[i+1][j+1]);
                if(j>0)
                    min=Math.min(min,dp[i+1][j-1]);
                min=Math.min(dp[i+1][j],min);
                dp[i][j]=A[i][j]+min;
            }
        }
        int min=Integer.MAX_VALUE;
        for(i=0;i<n;i++)
        {
            min=Math.min(min,dp[0][i]);
        }
        return min;
    }
}