import java.util.Scanner;
public class P1
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,sum=0;
        for(i=0;i<n;i++)
        {
            System.out.print("Enter Value: ");
            a[i]=sc.nextInt();
        }
        for(i=n-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }    
}
