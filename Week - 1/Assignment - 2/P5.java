import java.util.Scanner;
class P5
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r=sc.nextDouble();
        double radius=Math.PI * r *r;
        System.out.println(radius);
    }    
}
