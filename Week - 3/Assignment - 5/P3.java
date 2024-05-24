import java.util.*;
class P1
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String s=sc.nextLine();    
        System.out.print("Enter Character to replace space with: ");
        char c=sc.nextLine().charAt(0);
        int i;
        String ns="";
        for(i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
                ns=ns+ch;
            else
                ns=ns+c;
        }
        System.out.println("New String: "+ns);
    }
}