
import java.util.*;

class brute {

    public static ArrayList<Integer> printLeadersBruteForce(int[] arr, int n) 
    {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) 
        {
            boolean leader = true;

            // Checking whether arr[i] is greater than all
            // the elements in its right side
            for (int j = i + 1; j < n; j++)
            {

                if (arr[j] > arr[i]) {
                    
                    // If any element found is greater than current leader
                    // curr element is not the leader.
                    leader = false;
                    break;
                }
            }

            // Push all the leaders in ans array.
            if (leader)
                ans.add(arr[i]);

        }

        return ans;

    }

    public static void main(String args[]) {
        // Array Initialization.
        int n = 6;
        int arr[] = { 10, 22, 12, 3, 0, 6 };

        ArrayList<Integer> ans = printLeadersBruteForce(arr, n);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }

    }
}
