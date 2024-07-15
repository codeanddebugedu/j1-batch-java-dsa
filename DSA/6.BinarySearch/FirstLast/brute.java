
import java.util.*;

public class brute {

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        int first = -1, last = -1;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == k) 
            {
                if (first == -1) 
                    first = i;
                last = i;
            }
        }
        return new int[] {first, last};
    }


    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {2, 4, 6, 8, 8, 8, 11, 13}));
        int n = 8, k = 8;
        int[] ans = firstAndLastPosition(arr, n, k);
        System.out.println("The first and last positions are: "
                           + ans[0] + " " + ans[1]);
    }
}

