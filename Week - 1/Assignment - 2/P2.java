import java.util.Scanner;
class P2
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int x=sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int y=sc.nextInt();
        System.out.println("Addition: "+(x+y));
        System.out.println("Subtraction: "+(x-y));
        System.out.println("Multiplication: "+(x*y));
        System.out.println("Division: "+(x/y));

    }    
}
