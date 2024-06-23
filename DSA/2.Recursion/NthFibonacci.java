import java.util.Scanner;

public class NthFibonacci 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int x=sc.nextInt();
        NthFibonacci obj=new NthFibonacci();
        
        int ans=obj.fib(x);
        System.out.println("Nth Fibocanni Number: "+ans);
    }    
    public int fib(int n) 
    {
        if(n<=1)
            return n;
        else
            return fib(n-1) + fib(n-2);
    }    
}
