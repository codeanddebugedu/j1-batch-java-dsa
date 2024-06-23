import java.util.*;
public class OneToN 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int x=sc.nextInt();
        OneToN obj=new OneToN();
        obj.func(x);
    }   
    void func(int n)
    {
        if(n==0)
            return;
        else
        {
            func(n-1);
            System.out.println(n);
        }
    } 
}
