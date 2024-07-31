class combination 
{
    
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        Arrays.sort(candidates);
        helper(candidates,target,0,new ArrayList<>());
        return ans;
    }
    void helper(int candidates[],int target,int start,ArrayList<Integer> tempList)
    {
        if(target==0)
        {
            ans.add(new ArrayList<>(tempList));
            return;
        }
        int i;
        for(i=start;i<candidates.length;i++)
        {
            if(candidates[i]>target)
                return;
            tempList.add(candidates[i]);
            helper(candidates,target-candidates[i],i,tempList);
            tempList.remove(tempList.size()-1);
        }
    }
}