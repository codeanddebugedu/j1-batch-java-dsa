public class display 
{
    public static void main(String[] args) 
    {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int i,j,flag=0;
        for(i=0;i<3;i++)
        {
            for(j=2;j>=0;j--)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        } 
    }    
}
