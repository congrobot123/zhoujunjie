import java.lang.StringBuffer;
import java.util.Scanner;
public class Test3 
{
	private String calculate(StringBuffer value)
	{
		char[] t=new char[10];
		String value1;
		value.getChars(2,4,t,0);
		value1=String.valueOf(t);
		return value1;
	}
	
	private String calculate1(StringBuffer value)
	{
		char[] t=new char[10];
		String value1;
		value.getChars(1,2,t,0);
		value1=String.valueOf(t);
		return value1;
	}
	private String calculate2(StringBuffer value)
	{
		char[] t=new char[10];
		String value1;
		value.getChars(5,6,t,0);
		value1=String.valueOf(t);
		return value1;
	}
	public static void main(String[] args) 
	{
		StringBuffer value=new StringBuffer("ABCDEFG");
		Scanner sc=new Scanner(System.in);
		Test3 t=new Test3();
		
		System.out.println(t.calculate(value));
		System.out.println(t.calculate1(value));
		System.out.println(t.calculate2(value));
	}
}
