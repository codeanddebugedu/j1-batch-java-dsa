import java.util.Scanner;
public class P3
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");;
        int n=sc.nextInt();

        int a[]=new int[n];

        System.out.println("\nInput of 1st Array");
        int i;
        for(i=0;i<n;i++)
        {
            System.out.print("Enter Value: ");
            a[i]=sc.nextInt();
        }
        sc.close();
        for(i=0;i<n;i++)
        {
            if(a[i]%2==0)
                a[i]=a[i]*a[i];
            else
                a[i]=a[i]*a[i]*a[i];
        }
        System.out.println("\nNew Array");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }    
}
