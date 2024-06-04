public class P4 
{
    public static void main(String[] args) 
    {
        P4 obj=new P4();
        P4 obj1=obj.add(2,6).sub(6,2);    
    }    
    P4 add(int a,int b)
    {
        System.out.println(a+b);
        return this;
    }
    P4 sub(int a,int b)
    {
        System.out.println(a-b);
        return this;
    }
}
