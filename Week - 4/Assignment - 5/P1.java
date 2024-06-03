class P1 
{
	int age;
	public P1() 
	{
		age = 5;
	}
	public static void main(String[] args) 
	{
		P1 obj = new P1();
		System.out.println(obj.age);
        P1 obj1=new P1();
        obj1.age=7;
        System.out.println(obj1.age);
	}
}
