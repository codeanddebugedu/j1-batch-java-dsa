public class Bubble 
{
    public static void main(String[]args)
    {
        int a[]={10,70,30,40,20,1};
        int i,j;
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a.length-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        for(i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }    
}
