public class P2
{
    public static void main(String[] args) 
    {
        int i,j,s,k=1;
        for(i=1;i<=4;i++)
        {
            for(s=i;s<=4;s++)
            {
                System.out.print("  ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(k+++" ");
            }
            System.out.println();
        }    
    }    
}
