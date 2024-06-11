public class P1 
{
    public static void main(String[]args)
    {
        try
        {
            int a = 5/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception Handled: "+e);
        }
        System.out.println("Code after exception");
    }    
}
