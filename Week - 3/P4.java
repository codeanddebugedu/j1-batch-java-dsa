import java.util.Scanner;
public class P4
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();
        sc.close();
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                    break;
            }
            if(j==i)
                System.out.println(i);
        }
    }    
}
