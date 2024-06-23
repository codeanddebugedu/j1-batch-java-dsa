public class CharFreq2
{
    public static void main(String[] args) 
    {
        String s="aazzddF1@@22";  //Asssuming any character
        int freq[]=new int[256];
        int i;
        for(i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            freq[ch]++;
        }  
        //Print Array
        for(i=0;i<freq.length;i++)
        {
            if(freq[i]!=0)
                System.out.println((char)(i)+" Occurs: "+freq[i]+" Times");
        }
    }    
}

