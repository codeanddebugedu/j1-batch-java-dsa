class subset 
{
    public List<List<Integer>> subsets(int[] nums) 
    {
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(nums,0,new ArrayList<>(),ans);
        return ans;
    }
    void backtrack(int nums[],int start,List<Integer> tempList,List<List<Integer>> ans)
    {
        ans.add(new ArrayList<>(tempList));
        int i;
        for(i=start;i<nums.length;i++)
        {
            tempList.add(nums[i]);
            backtrack(nums,i+1,tempList,ans);
            tempList.remove(tempList.size()-1);
        }
    }
}