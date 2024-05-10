import java.util.Scanner;
public class P2 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter r value: ");
        double r = sc.nextDouble();
        double vol= (4.0/3)*Math.PI*r*r*r;
        System.out.println("volume of sphere: "+Math.round(vol*100.0)/100.0);// converting to 2 decimal places
    }    
}
