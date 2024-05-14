import java.util.*;
public class P5
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        if(n%2==0 && n%5==0)
            System.out.println("Number is divisible by 2 and 5");
        else if(n%2==0 && n%5!=0)
            System.out.println("Number is divisible by 2 but not by 5");
        else if(n%5==0 && n%2!=0)
            System.out.println("Number is divisible by 5 but not by 2");
    }
}