import java.util.*;

class optimal 
{

    public static ArrayList<Integer> printLeadersBruteForce(int[] arr, int n) 
    {

        ArrayList<Integer> ans = new ArrayList<>();
        // Last element of an array is always a leader,
        // push into ans array.
        int max = arr[n - 1];
        ans.add(arr[n - 1]);
        // Start checking from the end whether a number is greater
        // than max no. from right, hence leader.
        for (int i = n - 2; i >= 0; i--)
            if (arr[i] > max) {
                ans.add(arr[i]);
                max = arr[i];
            }

        return ans;

    }

    public static void main(String args[]) {
        // Array Initialization.
        int n = 6;
        int arr[] = { 10, 22, 12, 3, 0, 6 };

        ArrayList<Integer> ans = printLeadersBruteForce(arr, n);

        Collections.sort(ans, Collections.reverseOrder());

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }

    }
}
