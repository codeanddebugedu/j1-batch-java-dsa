class Solution 
{
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        if(matrix.length == 0)
            return false;
        
        int rows=matrix.length;
        int columns=matrix[0].length;

        int low=0;
        int high=(rows * columns - 1);

        while(low<=high)
        {
            int mid=(low+high)/2;
            int value=matrix[mid/columns][mid%columns];

            if(value == target)
                return true;
            else if(target>value)
                low=mid+1;
            else
                high=mid-1;
        }    
        return false;
    }
}