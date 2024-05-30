import java.util.Scanner;
class P3 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a=sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b=sc.nextInt();
        P3 obj=new P3();  
        System.out.println("\nAddition = "+obj.add(a,b));
        System.out.println("Subtraction = "+obj.sub(a,b));
        System.out.println("Multiplication = "+obj.mul(a,b));
        System.out.println("Divisinon = "+obj.div(a,b));
    }   
    public int add(int a,int b)
    {
        return a+b;
    } 
    public int sub(int a,int b)
    {
        return a-b;
    }  
    public int mul(int a,int b)
    {
        return a*b;
    } 
    public double div(int a,int b)
    {
        if(b==0)
            System.out.println("Division by 0 not possible");
        return (double)a/b;
    } 
}
