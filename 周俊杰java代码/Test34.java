import java.util.Scanner;
public class Test34 
{
	String a;
	void scan()
	{
		Scanner sc=new Scanner(System.in);
		sc.useDelimiter("\n");
		a=sc.next();
	}
	void calculate()
	{
		int a1=0,b1=0,c1=0,d1=0;
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)<='z'&&a.charAt(i)>='a'||a.charAt(i)<='Z'&&a.charAt(i)>='A')
				a1++;
			else if(a.charAt(i)<='9'&&a.charAt(i)>='0')
				b1++;
			else if(a.charAt(i)==' ')
				c1++;
			else
				d1++;

		}
		
		System.out.print("����:"+b1+" "+"��ĸ:"+a1+" "+"�ո�:"+c1+" "+"����:"+d1);	
	}
	public static void main(String[] args) 
	{
		Test34 t=new Test34();
		t.scan();
		t.calculate();
		
	}
}
