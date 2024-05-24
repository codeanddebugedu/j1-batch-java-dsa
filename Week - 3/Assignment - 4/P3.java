import java.util.*;
class P3
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String s=sc.nextLine();    
        int i;
        String rev="";
        for(i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            rev=ch+rev;
        }
        if(s.equalsIgnoreCase(rev))
            System.out.println("Palindrome String");
        else
            System.out.println("Not a Palindrome String");
    }    
}
