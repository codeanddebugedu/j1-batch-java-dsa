import java.util.*;
class P4
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st String: ");
        String s=sc.nextLine(); 
        System.out.print("Enter 2nd String: ");
        String w=sc.nextLine(); 
        System.out.println("Original String");
        System.out.println(s+" "+w);
        
        s=s+w;
        w=s.substring(0,s.length()-w.length());
        s=s.substring(w.length());
        System.out.println("Replaced String");
        System.out.println(s+" "+w);
    }
}