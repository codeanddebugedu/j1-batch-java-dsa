import java.util.Scanner;
public class P4 
{
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("\nEnter Values in Array");
        int i;
        for(i=0;i<n;i++)
        {
            System.out.print("Enter Value: ");
            a[i]=sc.nextInt();
        }
        int k=n%2==1?n/2+1:n/2;
        for(i=0;i<n/2;i++)
        {
            int t=a[i];
            a[i]=a[k];
            a[k]=t;
            k++;
        }
        System.out.println();
        for(i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }   
}
