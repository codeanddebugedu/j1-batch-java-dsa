

import java.util.*;

public class optimal {

    public static int upperBound(ArrayList<Integer> arr, int n, int x) {
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) 
        {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr.get(mid) > x) 
            {
                ans = mid;
                // look for smaller index on the left
                high = mid - 1;
            } 
            else 
            {
                low = mid + 1; // look on the right
            }
        }
        return ans;
    }

    public static int lowerBound(ArrayList<Integer> arr, int n, int x) 
    {
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) 
        {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr.get(mid) >= x) 
            {
                ans = mid;
                // look for smaller index on the left
                high = mid - 1;
            } 
            else 
            {
                low = mid + 1; // look on the right
            }
        }
        return ans;
    }

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        int lb = lowerBound(arr, n, k);
        if (lb == n || arr.get(lb) != k) return new int[] { -1, -1};
        int ub = upperBound(arr, n, k);
        return new int[] {lb, ub - 1};
    }


    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {2, 4, 6, 8, 8, 8, 11, 13}));
        int n = 8, k = 8;
        int[] ans = firstAndLastPosition(arr, n, k);
        System.out.println("The first and last positions are: "
                           + ans[0] + " " + ans[1]);
    }
}

