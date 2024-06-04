public class P2 
{
    P2()
    {
        System.out.println("Default Constructor");
    }
    P2(int a)
    {
        this();
        System.out.println("Parameterized Constructor");
    }
    public static void main(String[] args) 
    {
        P2 obj=new P2(5);   
    }    
}
