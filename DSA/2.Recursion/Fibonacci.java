import java.util.Scanner;
public class Fibonacci 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int x=sc.nextInt();
        Fibonacci obj=new Fibonacci();
        System.out.println("Fibonacci Series upto n terms");
        for (int i = 1; i <= x; i++) 
        {
            System.out.print(obj.fib(i) + " ");
        }
    }    
    public int fib(int n) 
    {
        if(n<=1)
            return n;
        else
            return fib(n-1) + fib(n-2);
    }
}
