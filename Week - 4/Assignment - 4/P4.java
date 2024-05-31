import java.util.*;
public class P4
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        P4 obj=new P4();
        int i;
        System.out.print("Enter String: ");
        String s=sc.nextLine();
        System.out.println(obj.reverse(s));
    }    
    String reverse(String s)
    {
        int i;
        String rev="";
        for(i=s.length()-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            rev=rev+ch;
        }
        return rev;
    }  
}
