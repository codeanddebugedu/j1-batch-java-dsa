import java.util.Scanner;
public class P5
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int x=sc.nextInt();
        int cnt=0;
        while(x!=0)
        {
            cnt=cnt+1;
            x=x/10;
        }
        System.out.println("No of Digits are: "+cnt);
        sc.close();
    }    
}
