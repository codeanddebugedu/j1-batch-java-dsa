class P3
{
	int age;
	public P3(int a) 
	{
		age = a;
	}
    public P3(P3 obj) 
	{
		age = obj.age;
	}
	public static void main(String[] args) 
	{
		P3 obj = new P3(15);
        P3 obj1=new P3(obj);
		System.out.println(obj1.age);
	}
}