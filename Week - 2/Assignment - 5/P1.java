public class P1 
{
    public static void main(String[] args) {
        int i,j,s;
        for(i=1;i<=4;i++)
        {
            for(s=i;s<=3;s++)
            {
                System.out.print("  ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            for(j=i-1;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }    
}
