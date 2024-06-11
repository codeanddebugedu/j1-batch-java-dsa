class P3
{
    void display()
    {
        System.out.println("Hello");
    }  
}
class B extends P3
{
    void display2()
    {
        System.out.println("Display Method in B");
    }
}
class C extends P3
{
    void display3()
    {
        System.out.println("Display Method in C");
    }
    public static void main(String[]args)
    {
       C obj=new C();
       obj.display();
       obj.display3(); 
    }
}

