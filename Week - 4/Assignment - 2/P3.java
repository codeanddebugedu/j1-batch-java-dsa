import java.util.Scanner;
public class P3 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String s=sc.nextLine();
        char ch=sc.nextLine().charAt(0);
        if(s.indexOf(ch)!=-1)
            System.out.print("Character "+ch+ " exists in "+s);
        else
            System.out.print("Character "+ch+" does not exists in "+s);
    }    
}
