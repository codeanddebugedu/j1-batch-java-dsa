class Triangle
{
    public int minimumTotal(List<List<Integer>> triangle) 
		{
			int n=triangle.size();
			int dp[][]=new int[n+1][n+1];
			int i,j;
			for(i=n-1;i>=0;i--)
			{
				for(j=0;j<=i;j++)
				{
					dp[i][j]=triangle.get(i).get(j)+Math.min(dp[i+1][j],dp[i+1][j+1]);
				}
			}
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    System.out.print(dp[i][j]+" ");
                }
                System.out.println();
            }
			return dp[0][0];
    }
}