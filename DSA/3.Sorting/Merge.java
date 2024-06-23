public class Merge 
{
    public static void main(String[] args) 
    {
        int a[]={70,30,40,50,20};
        Merge obj=new Merge();
        obj.mergeSort(a,0,a.length-1);
        printArray(a);
    }    
    void mergeSort(int a[],int low,int high)
    {
        if (low >= high) 
            return;
        int mid = (low + high) / 2 ;
        mergeSort(a, low, mid);  // left half
        mergeSort(a, mid + 1, high); // right half
        merge(a, low, mid, high);  
    }
    private static void merge(int[] array, int left, int middle, int right) {
        int[] temp = new int[right - left + 1]; // Temporary array
        int i = left; // Starting index of the left subarray
        int j = middle + 1; // Starting index of the right subarray
        int k = 0; // Starting index for the temporary array
        // Merge the two subarrays into the temporary array
        while (i <= middle && j <= right) 
        {
            if (array[i] <= array[j]) 
            {
                temp[k] = array[i];
                i++;
            } 
            else 
            {
                temp[k] = array[j];
                j++;
            }
            k++;
        }
        // Copy any remaining elements of the left subarray
        while (i <= middle) 
        {
            temp[k] = array[i];
            i++;
            k++;
        }
        // Copy any remaining elements of the right subarray
        while (j <= right) {
            temp[k] = array[j];
            j++;
            k++;
        }
        k=0;
        // Copy the sorted elements back into the original array
        for (i = left; i <= right; i++) 
        {
            array[i] = temp[k++];
        }
    }
    public static void printArray(int[] array) 
    {
        for (int i = 0; i < array.length; i++) 
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
