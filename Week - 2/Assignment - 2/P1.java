import java.util.*;
public class P1 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter Base: ");
        int b=sc.nextInt(); 
        System.out.print("Enter Exponent: ");    
        int e=sc.nextInt();
        int p=1;
        for(int i=1;i<=e;i++)
        {
            p=p*b;
        }
        sc.close();
        System.out.println("Power = "+p);
    }    
}
