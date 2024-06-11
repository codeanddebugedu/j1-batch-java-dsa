import java.io.IOException;

public class P2
{
    public static void main(String[]args)
    {
        P2 obj=new P2();
        try 
        {
            obj.m();
        } 
        catch (Exception e) 
        {
            System.out.println("NullPointer Exception Handled");
        }
    }   
    void m() 
    {
        throw new NullPointerException("Exception thrown");
    } 
}
