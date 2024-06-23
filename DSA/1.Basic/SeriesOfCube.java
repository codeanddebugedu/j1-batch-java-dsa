package Basic;

import java.util.Scanner;
public class SeriesOfCube 
{
    //1^3 + 2^3 + 3^3.....n^3
    //In O(1) time
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);   
       System.out.print("Enter Number: ");
       int n=sc.nextInt();  
       int sumOfN = (n*(n+1))/2;
       System.out.println("Sum of Series: "+(sumOfN * sumOfN));
    }    
}
