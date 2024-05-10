import java.util.Scanner;
public class P3 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Temperature in Fahrenheit: ");
        double f=sc.nextDouble();
        double c;
        c=(5.0/9)*(f-32);
        System.out.println("Centigrate value: "+Math.round(c*100)/100.0);//rounded upto 2 decimal places
    }
}
