class largeodd 
{
    public String largestOddNumber(String num) 
    {
        int i;
        for(i=num.length()-1;i>=0;i--)
        {
          char ch=num.charAt(i);
          if(ch%2==1)
            return num.substring(0,i+1);
        }    
        return "";
    }
}