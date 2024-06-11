public class P2
{
    public static void main(String[]args)
    {
        try
        {
            String s=null;
            int l=s.length();
        }
        catch(NullPointerException e)
        {
            System.out.println("NullPointerException Exception Handle");
        }
        System.out.println("Code after exception");
    }    
}
