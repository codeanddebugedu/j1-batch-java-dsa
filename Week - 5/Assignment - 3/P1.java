import java.io.IOException;

public class P1 
{
    public static void main(String[]args)
    {
        P1 obj=new P1();
        try 
        {
            obj.m();
        } 
        catch (Exception e) 
        {
            System.out.println("IO Exception Handled");
        }
    }   
    void m() throws IOException
    {
        throw new IOException("Exception thrown");
    } 
}
