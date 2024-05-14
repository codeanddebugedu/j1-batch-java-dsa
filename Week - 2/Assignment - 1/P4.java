import java.util.*;
public class P4
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        System.out.print("Enter m: ");
        int m=sc.nextInt();
        int i;
        for(i=n+1;i<m;i++)
        {
            System.out.println(i);
        }
    }
}