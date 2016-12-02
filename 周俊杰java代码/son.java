public class son 
{
	int c;
	static int a;
	static void fun()
	{
		//System.out.println(z);
	}
	static class son2 
{
		static int z=1;
		static void fun1()
	{
		System.out.println(a);
	}
	void fun()
	{
		System.out.println(a);
	}
}

	public static void main(String[] args) 
	{
		/*son.son2 sn=new son.son2();
		sn.fun();
		son.fun();*/
		son s1=new son();
		//s1.fun();
		System.out.println(a);

	}
}

