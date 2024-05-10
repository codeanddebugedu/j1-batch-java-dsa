import java.util.Scanner;
public class P4 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Centimeter: ");
        int cm=sc.nextInt();
        int meter1,cm1;  
        meter1=cm/100;
        cm1=cm%100;
        System.out.println("Meter: "+meter1+"\nCentimeter: "+cm1);  
    }
}
