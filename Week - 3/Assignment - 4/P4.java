import java.util.*;
class P4
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String s=sc.nextLine();    
        int i,cntc=0,cntd=0,cntl=0,cnts=0,cntsp=0,cntu=0;
        String rev="";
        for(i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetter(ch))
            {
                cntc++;
                if(Character.isUpperCase(ch))
                    cntu++;
                else if(Character.isLowerCase(ch))
                    cntl++;
            }
            else if(ch==' ')
                cnts++;
            else if(Character.isDigit(ch))
                cntd++;
            else
                cntsp++;
        }
        System.out.println("Number of Characters: "+cntc);
        System.out.println("Number of Spaces: "+cnts);
        System.out.println("Number of Digits: "+cntd);
        System.out.println("Number of Uppercase characters: "+cntu);
        System.out.println("Number of Lowercase characters: "+cntl);
        System.out.println("Number of Special characters: "+cntsp);
    }    
}
