class Needle {
    public int strStr(String haystack, String needle) {
        int l1=haystack.length(),l2=needle.length();
        int i;
        if(l1<l2)
            return -1;
        else if(l2==0)
            return 0;
        int k=l1-l2;
        for(i=0;i<=k;i++)
        {
            if(haystack.substring(i,i+l2).equals(needle))
                return i;
        }
        return -1;
    }
}