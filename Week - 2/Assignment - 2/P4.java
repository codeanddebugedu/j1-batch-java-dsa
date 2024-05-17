import java.util.Scanner;
public class P4
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int x=sc.nextInt();
        sc.close();
        int sum=0;
        while(x!=0)
        {
            int rem=x%10;
            if(rem%2==0)
                sum=sum+rem;
            x=x/10;
        }
        System.out.println("Sum of Even Digits: "+sum);
    }    
}
