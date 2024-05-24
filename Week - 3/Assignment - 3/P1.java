import java .util.*;
class P1
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("\nEnter Values in Array");
        int i,index=-1,min=Integer.MAX_VALUE,sec_min=Integer.MAX_VALUE;
        for(i=0;i<n;i++)
        {
            System.out.print("Enter Value: ");
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]<min)
            {
                sec_min=min;
                min=a[i];
            }
            else if(a[i]<sec_min && a[i] != min)
            {
                sec_min=a[i];
                index=i;
            }
        }
        System.out.println("\nIndex of Second Minimum Value: "+index);
        sc.close();
    }
}
