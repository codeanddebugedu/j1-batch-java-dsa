public class P1 
{
    int a,b;
    P1(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public static void main(String[]args)
    {
        P1 obj=new P1(2,6);
        System.out.println(obj.a);
        System.out.println(obj.b);
    }
}
