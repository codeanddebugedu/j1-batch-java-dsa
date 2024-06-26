public class optimal 
{
    public static void main(String[] args) 
    {
        optimal obj=new optimal();
        int a[]={3,4,5,1,2};
        if(obj.check(a))
            System.out.println("Array is sorted and rotated");
    }   
    public boolean check(int[] nums) 
    {
        int i,count=0;
        if(nums.length == 1)
            return true;
        for(i=1;i<nums.length;i++)
        {
            if(nums[i-1]>nums[i])
                count++;
        }
        if(nums[nums.length-1]>nums[0])
                count++;
        return count<=1;
    } 
}
