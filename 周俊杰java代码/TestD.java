import java.util.Scanner;
public class TestD 
{
	public String str1;
	public String str2;
	char[] Sumstr=new char[100];
	private void scan()
	{
		Scanner sc=new Scanner(System.in);		
		str1=sc.next();
		str2=sc.next();
	}
	public void calculate()
	{
		int i,j;
		scan();
		for(i=0;i<str1.length();i++ )
			Sumstr[i]=str1.charAt(i);
		for(j=0;j<str1.length();j++,i++)
			Sumstr[i]=str2.charAt(j);
		for(i=0;i<=str1.length()+str2.length();i++)
			System.out.print(Sumstr[i]);
		
	}
	public static void main(String[] args) 
	{
		TestD s=new TestD();
		s.calculate();
	}
}
