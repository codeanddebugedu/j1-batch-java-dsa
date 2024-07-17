class optimal
{
     long floorSqrt(long x)
	 {
		// Your code here
		if(x==0 || x==1){
		    return x;
		}
		
		long left=0, right=x, result=0;
		
		while(left<=right)
		{
		    long mid = (left+right)/2;
		    long sqmid = mid*mid;
		    
		    if(sqmid == x){
		        return mid;
		    }
		    else if(sqmid < x){
		        left = mid+1;
		        result = mid;
		    }
		    else{
		        right = mid -1;
		    }
		    
		}
		return result;
	 }
}