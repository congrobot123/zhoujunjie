import java.util.Scanner;

public class Test2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		try
		{
			if(str.equals("I am 007"))
				System.out.println("亲爱的007 你好");
			else 
				throw new Exception("对不起，请下次进入");
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
