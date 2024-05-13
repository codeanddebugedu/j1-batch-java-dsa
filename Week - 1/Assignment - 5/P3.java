import java.util.*;
public class P3 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year=sc.nextInt();
        
        if(year%4==0)
        {
            System.out.println("Leap year");
        }
        else
            System.out.println("Not a Leap year");
    }    
}
