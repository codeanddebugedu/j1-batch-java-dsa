import java.util.*;
class hashmap 
{
    public int singleNonDuplicate(int[] nums) 
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }    
        for(int key: map.keySet())
        {
            if(map.get(key) == 1)
                return key;
        }
        return -1;
    }
}