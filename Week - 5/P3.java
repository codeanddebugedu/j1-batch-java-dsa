public class P3 
{
    int a=20,b=10;
    void m(P3 obj) 
    {
        System.out.println("method is invoked");
        System.out.println(obj.a);
    }

    void p() 
    {
        m(this);
    }

    public static void main(String args[]) {
        P3 obj = new P3();
        obj.a=30;
        obj.p();
    }
}
