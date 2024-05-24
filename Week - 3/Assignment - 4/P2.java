import java.util.*;
class P2 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String s=sc.nextLine();    
        int i,cntv=0,cntc=0;
        for(i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetter(ch))
            {
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                    cntv++;
                else
                    cntc++;
            }
        }
        System.out.println("No of Vowels: "+cntv);
        System.out.println("No of Consonents: "+cntc);
    }    
}
