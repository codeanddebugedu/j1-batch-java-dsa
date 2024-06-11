class P1
{
    void display()
    {
        System.out.println("Hello");
    }  
}
class B extends P1
{
    public static void main(String[]args)
    {
        B obj = new B();
        obj.display();
    }
}
