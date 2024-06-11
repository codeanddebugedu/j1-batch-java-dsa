class MyException extends Exception
{
    MyException(String str)
    {
        super(str);
    }
}
public class P4 
{
    public static void main(String[] args)throws MyException 
    {
        try
        {
            throw new MyException("My own Exception");    
        }
        catch(Exception e)
        {
            System.out.println("Exception Handled");
        }
    }    
}
