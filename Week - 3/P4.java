import java.util.Scanner;
public class P4
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,sum=0;
        double average=0;
        for(i=0;i<n;i++)
        {
            System.out.print("Enter Value: ");
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            sum=sum+a[i];
        }
        average=(double)sum/n;
        System.out.println("\nSum of Odd Elements: "+average);
    }    
}
