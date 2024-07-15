class xor 
{
    public int singleNonDuplicate(int[] nums) 
    {
        //a ⊕ a = 0  
        int result = 0;
        for(int num: nums)
        {
            result^=num;
            System.out.println(result);
        }
        return result;
    }
}