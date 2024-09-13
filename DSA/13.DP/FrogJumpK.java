class FrogJumpK 
{
    public int minimizeCost(int arr[], int k) 
    {
        int n=arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);  // Fill dp with large values
        dp[0] = 0;  // No cost to start at the first stone

        // Loop through each stone
        for (int i = 1; i < n; i++) 
        {
            // Check all previous stones from which we can jump to the current stone
            for (int j = Math.max(0, i - k); j < i; j++) 
            {
                dp[i] = Math.min(dp[i], dp[j] + Math.abs(arr[i] - arr[j]));
            }
        }

        // The result is the minimum cost to reach the last stone
        return dp[n - 1];
    }
}