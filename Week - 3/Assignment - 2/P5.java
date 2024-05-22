import java.util.Scanner;
public class P5
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");;
        int n=sc.nextInt();

        int a[]=new int[n];

        int i;
        for(i=0;i<n;i++)
        {
            System.out.print("Enter Value: ");
            a[i]=sc.nextInt();
        }
        sc.close();
        int min=Integer.MAX_VALUE;
        for(i=0;i<n;i++)
        {
            if(a[i]<min)
                min=a[i];
        }
        System.out.println(min+" is Minimum value in the array");
    }    
}
