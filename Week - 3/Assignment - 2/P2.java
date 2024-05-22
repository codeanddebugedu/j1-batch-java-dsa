import java.util.Scanner;
public class P2 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");;
        int n=sc.nextInt();

        int a[]=new int[n];
        int b[]=new int[n];
        int c[]=new int[n];

        System.out.println("\nInput of 1st Array");
        int i;
        for(i=0;i<n;i++)
        {
            System.out.print("Enter Value: ");
            a[i]=sc.nextInt();
        }
        System.out.println("\nInput of 2nd Array");
        for(i=0;i<n;i++)
        {
            System.out.print("Enter Value: ");
            b[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("\nMultiplication of 2 Arrays");
        for(i=0;i<n;i++)
        {
            c[i]=a[i]*b[i];
            System.out.print(c[i]+" ");
        }
    }    
}
