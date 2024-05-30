import java.util.*;
class P4 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int x=sc.nextInt();
        P4 obj=new P4();
        if(obj.isPalin(x))
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome Number");
    } 
    boolean isPalin(int x)
    {
        int rem,rev=0,y=x;
        while(x!=0)
        {
            rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        return rev==y;
    }   
}
