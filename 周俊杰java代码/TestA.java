interface son1
{
	int value1=1;
	int value2=2;
	void fun1();
}
interface son2
{
	int value3=3;
	void fun2();
	default void fun3()
	{
		System.out.println("fun3");
	}
	static void fun4()
	{

		System.out.println("fun4");
	}
}
class TestA implements son1,son2
{
	public void fun1()
	{
		System.out.println("fun1");
	}
	public void fun2()
	{
		System.out.println("fun2");
	}
	public static void main(String[] args) 
	{
		TestA t=new TestA();
		t.fun1();
		t.fun2();
		t.fun3();
		son2.fun4();

	}	
}
