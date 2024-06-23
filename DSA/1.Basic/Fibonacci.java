package Basic;

import java.util.*;
public class Fibonacci 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int x=sc.nextInt();
        Fibonacci obj=new Fibonacci();
        
        int a = 0,b=1;
        System.out.println("\nFibonacci Series up to " + x + " terms:");
        
        if (x >= 1) 
            System.out.print(a + " ");

        if (x >= 2) 
            System.out.print(b + " ");

        for (int i = 2; i < x; i++) 
        {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }    
}
