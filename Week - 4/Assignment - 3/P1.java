import java.util.*;
public class P1 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a=sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b=sc.nextInt();
        P1 obj=new P1();
        int ans=obj.add(a,b);
        System.out.println("Sum = "+ans);
    }   
    public int add(int a,int b)
    {
        return a+b;
    } 
}
