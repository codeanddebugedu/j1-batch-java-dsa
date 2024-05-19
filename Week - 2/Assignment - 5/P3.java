public class P3 
{
    public static void main(String[] args) 
    {
        int i,j,s;
        for(i=5;i>=1;i--)
        {
            for(s=i;s<=4;s++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }   
        for(i=2;i<=5;i++)
        {
            for(s=i;s<=4;s++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }    
    }    
}
