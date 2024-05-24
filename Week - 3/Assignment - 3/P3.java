import java.util.*;
class P3 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size of 1st Array: ");
        int n=sc.nextInt();
        System.out.print("Enter Size of 2nd Array: ");
        int m=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        int c[]=new int[n+m];
        System.out.println("\nEnter Values in 1st Array");
        int i;
        for(i=0;i<n;i++)
        {
            System.out.print("Enter Value: ");
            a[i]=sc.nextInt();
        }
        System.out.println("\nEnter Values in 2nd Array");
        for(i=0;i<m;i++)
        {
            System.out.print("Enter Value: ");
            b[i]=sc.nextInt();
        }

        for(i=0;i<n;i++)
        {
            c[i]=a[i];
        }
        for(i=0;i<m;i++)
        {
            c[n+i]=b[i];
        }
        System.out.println("\nMerged Array");
        for(i=0;i<c.length;i++)
        {
            System.out.print(c[i]+" ");
        }
    }
}
