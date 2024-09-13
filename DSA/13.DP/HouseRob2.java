// The "House Robber II" problem is a variation of the "House Robber" problem, but with a twist: in this case, the houses are arranged in a circle. This means that you can't rob the first and last house together because they are adjacent in the circular arrangement.

// Here's a Java solution to this problem. The idea is to use dynamic programming but handle the circular nature of the problem by breaking it into two linear subproblems:

// Rob houses from the first to the second-to-last house.
// Rob houses from the second to the last house.
class HouseRob2 {
    public int rob(int[] nums) {
        // If there's only one house, return the amount in that house.
        if (nums.length == 1) 
            return nums[0];
        // If there are two houses, return the maximum amount between the two.
        if (nums.length == 2) 
            return Math.max(nums[0], nums[1]);

        // Calculate the maximum profit for the range [0, n-2]
        int max1 = robLinear(nums, 0, nums.length - 2);

        // Calculate the maximum profit for the range [1, n-1]
        int max2 = robLinear(nums, 1, nums.length - 1);

        // Return the maximum of the two results
        return Math.max(max1, max2);
    }

    private int robLinear(int[] nums, int start, int end) {
        int prevMax = 0; // Maximum amount robbed up to the previous house
        int currMax = 0; // Maximum amount robbed up to the current house

        for (int i = start; i <= end; i++) 
        {
            int temp = currMax; // Temporarily store the current maximum
            currMax = Math.max(prevMax + nums[i], currMax); // Update current maximum
            prevMax = temp; // Update previous maximum
        }

        return currMax; // Return the maximum amount robbed
    }
}