class longprefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String ans="";
        int i;
        for(i=0;i<Math.min(strs[0].length(),strs[strs.length-1].length());i++)
        {
            if(strs[0].charAt(i)!=strs[strs.length-1].charAt(i))
                break;
        }
        return strs[0].substring(0,i);
    }
}