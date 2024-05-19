public class P2 
{
    public static void main(String[] args) {
        int i,j,s,k=1;
        for(i=1;i<=4;i++)
        {
            k=1;
            for(s=i;s<=3;s++)
            {
                System.out.print("  ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(k+" ");
                k+=2;
            }
            k-=4;
            for(j=i-1;j>=1;j--)
            {
                System.out.print(k+" ");
                k-=2;
            }
            System.out.println();
        }
    }    
}
