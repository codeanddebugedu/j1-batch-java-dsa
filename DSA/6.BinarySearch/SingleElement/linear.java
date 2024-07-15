class linear 
{
    public int singleNonDuplicate(int[] nums) 
    {
        int i;
        for(i=0;i<nums.length-1;i+=2)
        {
            if(nums[i]!=nums[i+1])
                return nums[i];
        }
        return nums[i];  
    }
}