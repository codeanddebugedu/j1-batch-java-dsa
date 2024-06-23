public class IntFreq 
{
    public static void main(String[] args) 
    {
        int a[]={1,1,1,7,7,10,10,2,3,3};
        int freq[]=new int[11];
        
        int i;
        for(i=0;i<a.length;i++)
        {
            freq[a[i]]++;
        }
        for(i=1;i<freq.length;i++)
        {
            if(freq[i]!=0)
                System.out.println(i+" Occurs "+freq[i]+" times");
        }
    }    
}
