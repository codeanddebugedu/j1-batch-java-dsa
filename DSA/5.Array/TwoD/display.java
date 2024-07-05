public class display 
{
    public static void main(String[] args) 
    {
        int a[][]={{1,0,0},{0,1,0},{0,0,1}};
        int i,j,flag=0;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                if(i==j)
                {
                    if(a[i][j]!=1)
                        flag=1;
                }
                else if(a[i][j]!=0)
                    flag=1;

            }
        }    
        if(flag==0)
            System.out.println("Unit Matrix");
        else
            System.out.println("Not a Unit Matrix");
    }    
}
