class optimal
{
    public int NthRoot(int n, int m)
    {
        int start=1,end=m;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(Math.pow(mid,n) == m)
                return mid;
            else if(Math.pow(mid,n) <m)
                start=mid+1;
            else 
                end=mid-1;
        }
        return -1;
    }
}