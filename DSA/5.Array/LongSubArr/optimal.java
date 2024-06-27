import java.util.*;

public class optimal 
{
    public static int getLongestSubarray(int []a, long k) 
    {
        int n = a.length; // size of the array.

        int left = 0, right = 0; // 2 pointers
        long sum = 0;
        int maxLen = 0;
        while (right < n) 
        {
            // if sum > k, reduce the subarray from left
            // until sum becomes less or equal to k:
            sum += a[right];
            while (left <= right && sum > k) 
            {
                sum -= a[left];
                left++;
            }
            // if sum = k, update the maxLen i.e. answer:
            if (sum == k) 
                maxLen = Math.max(maxLen, right - left + 1);
            // Move forward thw right pointer:
            right++;
            // if (right < n) 
        }
        return maxLen;
    }

    public static void main(String[] args) 
    {
        int[] a = {10,5,2,7,1,9};
        long k = 15;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}