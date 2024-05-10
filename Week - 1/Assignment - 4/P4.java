import java.util.Scanner;
public class P4
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int x=sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int y=sc.nextInt();
        if(x!=y)
            System.out.println("Both Numbers are not Equal");
        else
            System.out.println("Both Numbers are equal");
    }
}
