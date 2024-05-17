import java.util.Scanner;
public class P3
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int x=sc.nextInt();
        sc.close();
        int i;
        for(i=1;i<=10;i++)
        {
            System.out.println(x+" * "+i+" = "+(x*i));
        }
    }    
}
