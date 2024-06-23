import java.util.*;
public class ReverseArray 
{
    public static void main(String[]args)
    {
        ReverseArray obj=new ReverseArray();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n=sc.nextInt();

        int a[]=new int[n];
        int i;
        for(i=0;i<a.length;i++)
        {
            System.out.print("Enter Value: ");
            a[i]=sc.nextInt();
        }
        System.out.println("\nOriginal array");
        for (int num : a) {
            System.out.print(num + " ");
        }
        obj.reverse(a,0,a.length-1);
        System.out.println("\nReversed array");
        for (int num : a) {
            System.out.print(num + " ");
        }
        // String s=Arrays.toString(a);
    }    
    void reverse(int a[],int start,int end)
    {
        if(start>=end)
            return;
        int temp = a[start];
        a[start]=a[end];
        a[end]=temp;
        reverse(a,start+1,end-1);
    }
}
