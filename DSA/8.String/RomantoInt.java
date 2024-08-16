class RomantoInt 
{
    public int romanToInt(String s) 
    {
        int i,res = 0;
        for(i=s.length()-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            switch(ch)
            {
                case 'M':
                    res+=1000;
                    break;
                case 'D':
                    res+=500;
                    break;
                case 'C':
                    res+=100*(res>=500?-1:1);
                    break;
                case 'L':
                    res+=50;
                    break;
                case 'X':
                    res+= 10*(res>=50?-1:1);
                    break;
                case 'V':
                    res+=5;
                    break;
                case 'I':
                    res+=(res>=5?-1:1);
                    break;
                default:
                    break;
            }
        }
        return res;
    }
}