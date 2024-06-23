import java.util.*;
public class StrPalin 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.nextLine();
        if(isPalindrome(s))
            System.out.println("It is a Palindrome String");
        else
            System.out.println("It is not a Palindrome String");
    }    
    public static boolean isPalindrome(String s)
    {
        System.out.println(s+" "+s.length());
        if(s.length()<=1)
            return true;
        if(s.charAt(0)!=s.charAt(s.length()-1))
            return false;
        return isPalindrome(s.substring(1,s.length()-1)); 
    }
}
