import java.util.Scanner;
public class P3
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int x=sc.nextInt();
        sc.close();
        int sum=0,big=0;
        while(x!=0)
        {
            int rem=x%10;
            if(rem>big)
                big=rem;
            x=x/10;
        }
        System.out.println("Biggest Digit is: "+big);
    }    
}
