public class Selection 
{
    public static void main(String[] args) 
    {
        int a[]={70,30,40,20,25,1};
        int i,j,min_index=0;
        for(i=0;i<a.length-1;i++)
        {
            min_index=i;
            for(j=i+1;j<a.length;j++)
            {
                if(a[j]<a[min_index])
                    min_index=j;
            }
            int t=a[min_index];
            a[min_index]=a[i];
            a[i]=t;
        }
        for(i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }    
}
