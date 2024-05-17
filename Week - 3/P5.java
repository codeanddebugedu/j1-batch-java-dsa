import java.util.Scanner;
public class P5
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int x=sc.nextInt();
        sc.close();
        int c=0;
        do
        {
            c++;
            x=x/10;
        }while(x!=0);
        System.out.println("No of Digits: "+c);
    }    
}
