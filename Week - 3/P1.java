public class P1 
{
    public static void main(String[] args) 
    {
        int i,j,s;
        for(i=1;i<=5;i++)
        {
            for(s=i;s<=4;s++)
            {
                System.out.print("  ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }    
    }    
}
