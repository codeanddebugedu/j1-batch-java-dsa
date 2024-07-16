import java.util.*;
class optimal 
{
    public int findKRotation(List<Integer> arr) 
    {
        
        int low = 0;
        int high = arr.size() - 1;

        while (low < high) 
        {
            int mid = low + (high - low) / 2;

            if (arr.get(mid)> arr.get(high)) 
            {
                low = mid + 1; // Pivot must be in the right part
            } 
            else 
            {
                high = mid; // Pivot might be mid or in the left part
            }
        }

        // At the end of the while loop, low == high, which should point to the pivot
       return low;
    }
}