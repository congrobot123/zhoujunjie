import java.util.Scanner;
import java.io.File;

public class TestScanner
{
	public static void main(String[] args)
		throws Exception
	{
		Scanner sc = new Scanner(new File("def.txt"));
		//sc.useDelimiter("1");

		int flag = 0;
		String str = null;
		Long temp1 = 0l;
		Long temp2 = 0l;
		while(sc.hasNextLong())
		{
			temp1 = sc.nextLong();
			if(flag == 0)
			{
				str =  temp1 + " + ";
				temp2 = temp1;
				flag = 1;
			}
			else
			{
				str = str + temp1 + " = ";
				temp2 = temp2 + temp1;
				str = str + temp2;
				System.out.println(str);
				flag = 0;
			}
		}
	}
}
