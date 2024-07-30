class subset2 
{
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) 
    {
        Arrays.sort(nums);
        backtrack(nums,0,new ArrayList<>());
        return ans;
    }

    private void backtrack(int [] nums, int start,List<Integer> tempList)
    {
        ans.add(new ArrayList<>(tempList));
        int i;
        for(i=start;i<nums.length;i++)
        {
            if(i!=start && nums[i]==nums[i-1])
                continue;
            tempList.add(nums[i]);
            backtrack(nums,i+1,tempList);
            tempList.remove(tempList.size()-1);
        }
    }    
}