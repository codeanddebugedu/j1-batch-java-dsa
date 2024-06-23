public class OneTo5 
{
    public static void main(String[]args)
    {
        OneTo5 obj=new OneTo5();
        obj.func(1);
    }    
    void func(int x)
    {
        if(x<=5) 
        {
            System.out.println(x);
            func(x+1);
        }
    }
}
