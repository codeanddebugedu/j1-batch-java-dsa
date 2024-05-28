import java.util.*;
class P2
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String s=sc.nextLine();    
        int i;
        String ns="";
        for(i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetter(ch))
            {
                if(Character.isUpperCase(ch))
                    ns=ns+Character.toLowerCase(ch);
                else
                    ns=ns+Character.toUpperCase(ch);
            }
            else
                ns=ns+ch;
        }
        System.out.println("New String: "+ns);
    }
}