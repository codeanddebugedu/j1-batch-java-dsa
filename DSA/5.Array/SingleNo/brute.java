package Array.SingleNo;

public class brute 
{
    
    public static int getSingleElement(int []arr) {
        // Size of the array:
        int n = arr.length;

        //Run a loop for selecting elements:
        for (int i = 0; i < n; i++) 
        {
            int cnt = 0;

            //find the occurrence using linear search:
            for (int j = 0; j < n; j++) 
            {
                if (arr[j] == arr[i])
                    cnt++;
            }

            // if the occurrence is 1 return ans:
            if (cnt == 1) 
                return arr[i];
        }

        //This line will never execute
        //if the array contains a single element.
        return -1;
    }

    public static void main(String args[]) {
        int[] arr = {4, 1, 2, 1, 2};
        int ans = getSingleElement(arr);
        System.out.println("The single element is: " + ans);

    }
}