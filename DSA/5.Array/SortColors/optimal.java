import java.util.Arrays;

public class optimal {

    public static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

    public static int[] dutchNatFlag(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        // one pass through the array swapping
        // the necessary elements in place
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low++, mid++);
            } else if (arr[mid] == 2) {
                swap(arr, mid, high--);
            } else if (arr[mid] == 1) {
                mid++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 0, 0, 0, 1, 1};
        System.out.println(Arrays.toString(dutchNatFlag(arr)));
    }
}
