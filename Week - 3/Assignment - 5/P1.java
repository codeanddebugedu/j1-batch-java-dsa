import java.util.*;
class P1
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
            if(ch!=' ')
                ns=ns+ch;
        }
        System.out.println("New String: "+ns);
    }
}