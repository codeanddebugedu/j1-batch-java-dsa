import java.util.Scanner;
public class P2 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int x=sc.nextInt();
        int i;
        for(i=1;i<=x/2;i++)
        {
            if(x%i==0)
                System.out.print(i+" ");
        }
        System.out.print(x);
        sc.close();
    }    
}
