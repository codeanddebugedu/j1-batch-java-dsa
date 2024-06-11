import java.util.*;
public class P3 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder(s);
        sb.reverse(); 
        System.out.println(sb);
    }    
}
