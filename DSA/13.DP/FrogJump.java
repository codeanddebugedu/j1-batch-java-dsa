import java.util.Arrays;
class FrogJump
{
    public int minimumEnergy(int height[],int n)
    {
        //code here
        if (n == 1) return 0;  // If there's only one step, no cost is required

        int[] dp = new int[n];  // Array to store the minimum cost to reach each step
        Arrays.fill(dp, 0);     // Initialize the dp array with 0

        dp[0] = 0;  // Starting point, no cost
        dp[1] = Math.abs(height[1] - height[0]);  // Cost to reach the second step

        // Fill the dp array from the second step to the last step
        for (int i = 2; i < n; i++) {
            int jumpOneStep = dp[i - 1] + Math.abs(height[i] - height[i - 1]);
            int jumpTwoSteps = dp[i - 2] + Math.abs(height[i] - height[i - 2]);
            dp[i] = Math.min(jumpOneStep, jumpTwoSteps);
        }

        return dp[n - 1]; 
    }
}
