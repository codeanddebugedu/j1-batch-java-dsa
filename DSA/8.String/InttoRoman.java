class InttoRoman 
{
    int a[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
    String b[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

    public String intToRoman(int num) 
    {
        int i;
        for(i=0;i<a.length;i++)
        {
            if(num >= a[i])
                return b[i] + intToRoman(num - a[i]);
        }
        return "";
    }
}