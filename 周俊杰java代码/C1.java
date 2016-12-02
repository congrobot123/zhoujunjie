public class C1 extends C2
{
	public int c=160;
	byte d=(byte)c;
	public static void s(int a,int b)
	{

		System.out.println(a+b);
	}
	public  void t()
	{
		System.out.println(d);
	}
	public static void main(String[] args) 
	{
		C1 c=new C1();
		//C1.s(1,2);
		c.t();	
	}
}
class C2
{public int a;

}