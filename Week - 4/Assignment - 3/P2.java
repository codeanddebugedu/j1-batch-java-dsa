import java.util.*;
class P2 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int x=sc.nextInt();
        P2 obj=new P2();
        obj.factorial(x);
    }    
    void factorial(int a)
    {
        int i,f=1;
        for(i=a;i>=1;i--)
        {
            f=f*i;
        }
        System.out.println("Factorial = "+f);
    }
}
