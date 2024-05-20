package Solutions.Test;
import java.util.Scanner;
public class P1 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int x=sc.nextInt();
        int rem,rev=0,y=x;
        while(x!=0)
        {
            rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }    
        if(rev==y)
            System.out.println("Palindrome Number");
        else    
            System.out.println("Not a Palindrome Number");
    }    
}
