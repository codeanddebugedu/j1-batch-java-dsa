import java.util.Scanner;
class P4
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int x=sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int y=sc.nextInt();
        System.out.println("Original Values");
        System.out.println("x = "+x+" y = "+y);

        x=x+y;
        y=x-y;
        x=x-y;
        
        System.out.println("Swapped Values");
        System.out.println("x = "+x+" y = "+y);
    }    
}
