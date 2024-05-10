import java.util.Scanner;
public class P2
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st time");
        System.out.print("Enter hr: ");
        int hr1=sc.nextInt();
        System.out.print("Enter min: ");
        int min1=sc.nextInt();
        
        System.out.println("\nEnter 2nd time");
        System.out.print("Enter hr: ");
        int hr2=sc.nextInt();
        System.out.print("Enter min: ");
        int min2=sc.nextInt();

        int sum1,sum2,tot_min,hr,min;
        
        sum1=hr1*60+min1;
        sum2=hr2*60+min2;

        tot_min=sum1+sum2;
        
        hr=tot_min/60;
        min=tot_min%60;

        System.out.println(hr+" hrs "+min+" minutes");
    }
}
