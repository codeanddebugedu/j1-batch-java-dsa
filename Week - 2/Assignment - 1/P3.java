import java.util.*;
public class P3 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks: ");
        int m=sc.nextInt();
        if(m>=75 && m<=100)
            System.out.println("Grade A");
        else if(m>=60 && m<=74)
            System.out.println("Grade B");
        else if(m>=50 && m<=59)
            System.out.println("Grade C");
        else if(m>=40 && m<=49)
            System.out.println("Grade D");
        else if(m<=39 && m>=0)
            System.out.println("Grade F");
        else
            System.out.println("Invalid Input");   
    }    
}
