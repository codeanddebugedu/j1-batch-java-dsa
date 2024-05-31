public class P1 
{
    public static void main(String[]args)
    {
        int i;
        for(i=1;i<=100;i++)
        {
            if(isPrime(i))
                System.out.println(i);
        }
    }    
    public static boolean isPrime(int x)
    {
        int i;
        for(i=2;i<x;i++)
        {
            if(x%i==0)
                return false;
        }
        return true;
    }
}
