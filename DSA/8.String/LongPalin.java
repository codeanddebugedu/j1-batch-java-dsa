class Solution 
{
    int l,maxlen;
    public String longestPalindrome(String s) 
    {
        int i,len=s.length();
        if(len<2)
            return s;
        for(i=0;i<len-1;i++)
        {
            expandAroundCenter(s,i,i); 
            expandAroundCenter(s,i,i+1);
        }
        return s.substring(l,l+maxlen);
    }
    void expandAroundCenter(String s,int left,int right)
    {
        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right))
        {
            left--;
            right++;
        }
        if(right-(++left)>maxlen)
        {
            l=left;
            maxlen=right-left;
        }
    }
}