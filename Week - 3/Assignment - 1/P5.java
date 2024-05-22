import java.util.Scanner;
public class P5
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,sumo=0;
        for(i=0;i<n;i++)
        {
            System.out.print("Enter Value: ");
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(i%2==1)
                sumo+=a[i];
        }
        System.out.println("\nSum of Odd Indexes: "+sumo);
    }    
}
