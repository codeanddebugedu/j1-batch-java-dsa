public class CharFreq1
{
    public static void main(String[] args) 
    {
        String s="aazzbdde";  //Asssuming all characters are lowercase
        int freq[]=new int[26];
        int i;
        for(i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            freq[ch-97]++;
        }  
        //Print Array
        for(i=0;i<freq.length;i++)
        {
            if(freq[i]!=0)
                System.out.println((char)(i+97)+" Occurs: "+freq[i]+" Times");
        }
    }    
}
