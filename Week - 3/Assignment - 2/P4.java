import java.util.Scanner;
public class P4
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");;
        int n=sc.nextInt();

        int a[]=new int[n];

        int i,index=-1;
        for(i=0;i<n;i++)
        {
            System.out.print("Enter Value: ");
            a[i]=sc.nextInt();
        }
        sc.close();
        int max=Integer.MIN_VALUE;
        for(i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
                index=i;
            }
        }
        System.out.println("\nIndex of Maximum value: "+index);
    }    
}
