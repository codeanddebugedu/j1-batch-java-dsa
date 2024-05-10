import java.util.Scanner;
public class P1 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Days: ");
        int days=sc.nextInt();
        int y,rem_days,m,d;

        y=days/365;
        rem_days=days%365;
        m=rem_days/30;
        d=rem_days%30;
        System.out.println(y+" years "+m+" month "+d+" days");
    }
}
