import java.util.Scanner;
public class P1
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        int a[]=new int[5];
        int i;
        System.out.println("Enter Values of Arrays");
        for(i=0;i<a.length;i++)
        {
            System.out.print("Enter Value: ");
            a[i]=sc.nextInt();
        }
        sc.close();
        for(i=0;i<5;i++)
        {
            a[i]=a[i]*a[i];
        }
        System.out.println("\nSquared Values");
        for(i=0;i<5;i++)
        {
            System.out.print(a[i]+" ");
        }
    }    
}
