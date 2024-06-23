public class Insertion 
{
    public static void main(String[] args) 
    {
        int a[] = {10,70,30,40,20};
        int i,j;
        for(i=1;i<a.length;i++)
        {
            int key=a[i];
            j=i-1;
            while(j>=0 && a[j]>key)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }    
        for(i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }    
}
