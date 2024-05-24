import java.util.Scanner;
class P5 
{
    public static void main(String[] args) 
    {
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
        for(i=0;i<n;i++)
        {
            if(a[i]!=a[0])
                break;
        }   
        if(i==n)
            System.out.println("\nAll Elements are Equal");
        else
            System.out.println("\nAll Elements are not equal");
    }    
}
