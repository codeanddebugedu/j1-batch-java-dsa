public class P2 
{
    public static void main(String[]args)
    {
        P2 obj=new P2();
        int i;
        for(i=1;i<=100;i++)
        {
            if(obj.isDuck(i))
                System.out.println(i);
        }
    }    
    boolean isDuck(int x)
    {
        int rem=0;
        while(x!=0)
        {
            rem=x%10;
            if(rem==0)
                return true;
            x=x/10;
        }
        return false;
    }    
}
