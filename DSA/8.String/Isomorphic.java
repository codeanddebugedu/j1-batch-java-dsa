class Isomorphic 
{
    public boolean isIsomorphic(String s, String t) 
    {
        HashMap<Character,Character> map=new HashMap<>();
        int i;
        for(i=0;i<s.length();i++)
        {
            char a=s.charAt(i);
            char b=t.charAt(i);
            if(map.containsKey(a))
            {
                if(map.get(a)!=b)
                    return false;
            }
            else
            {
                if(map.containsValue(b))
                    return false;
                else
                    map.put(a,b);
            }
        }
        return true;
    }
}