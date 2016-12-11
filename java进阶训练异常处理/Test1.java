import java.io.BufferedReader;
import java.io.FileReader;

public class Test1 
{


	public static void checked()
		throws Exception
	{
		BufferedReader br=new BufferedReader(new FileReader("log.txt"));
	}
	public static void runtime()
	{
		try
		{
			int i=2,j=0,value;
			value=i/j;
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) 
		throws Exception
	{
		Test1.checked();
		Test1.runtime();
	}
}
