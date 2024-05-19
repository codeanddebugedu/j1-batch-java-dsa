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
            int x=i;
            while(x!=0)
            {
                int rem=x%10;
                if(rem==0)
                    break;
                    x=x/10;
            }
            if(x!=0)
                System.out.println(i);
        }
    }    
}
