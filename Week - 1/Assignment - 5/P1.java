import java.util.*;
public class P1 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int x=sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int y=sc.nextInt();
        
        if(x<y)
            System.out.print(x+" is Smallest Number");
        else
            System.out.print(y+" is Smallest Number");
    }    
}
