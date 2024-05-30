import java.util.Scanner;
public class P4 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String s=sc.nextLine();
        int i,k=0;
        String ns="";
        for(i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(k++==0)
                ns=ns+Character.toUpperCase(ch);
            else if(ch==' ')
            {
                ns=ns+" ";
                k=0;
            }
            else
                ns=ns+Character.toLowerCase(ch);
        }
        System.out.println(ns);
    }    
}
