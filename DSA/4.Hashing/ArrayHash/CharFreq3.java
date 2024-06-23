public class CharFreq3
{
    public static void main(String[] args) 
    {
        String s="aazzddAABZ";  //Asssuming only uppercase and lowercase chars
        int freq[]=new int[52];
        int i;
        for(i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            var c=(ch>=97)?freq[ch-97]++:freq[ch-65+26]++;
        }  
        //Print Array
        for(i=0;i<freq.length;i++)
        {
            if(freq[i]!=0)
            {
                char ch=(char)(i<=26?(i+97):(i+65-26));
                System.out.println(ch+" Occurs: "+freq[i]+" Times");
            }
        }
    }    
}

