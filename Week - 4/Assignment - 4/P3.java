public class P3 
{
    public static void main(String[] args) 
    {
        P3 obj=new P3();
        int i;
        for(i=1;i<=100;i++)
        {
            if(obj.isPalin(i))
                System.out.println(i);
        }
    }    
    boolean isPalin(int x)
    {
        int rem,rev=0,y=x;
        while(x!=0)
        {
            rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        return rev==y;
    }  
}
