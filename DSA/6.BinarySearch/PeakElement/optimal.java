class optimal 
{
    public int findPeakElement(int[] nums) 
    {
        int n = nums.length-1;
        int low = 0,high = n;
        while(low < high)
        {
            int mid = (low+high)/2;
            if(nums[mid] < nums[mid+1])
                low = mid+1;
            else
                high = mid;
        }    
        return low;
    }
}