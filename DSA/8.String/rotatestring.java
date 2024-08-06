class rotatestring 
{
    public boolean rotateString(String s, String goal) 
    {
        if(s.length()!=goal.length())
            return false;
        String s2=s+s;
        return (s2.contains(goal));
    }
}