import java.util.Scanner;
public class P5
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Minutes: ");
        int min=sc.nextInt(); 
        int hr,min1;
        hr=min/60;
        min1=min%60;
        System.out.println(hr+" Hour "+min1+" Minutes");
    }
}
