import java.util.Scanner;
public class Test33  
{
	int s;
	void scan()
	{
		Scanner sc=new Scanner(System.in);
		s=sc.nextInt();

	}
	void calculate()
	{
		int i=2;
		while(i<=s)
		{
			if(s%i==0)
			{
				if(s!=i)
					System.out.print(i+"*");
				else
					System.out.print(i);
				s=s/i;
				i=1;
			}
			
			i++;

		}
	}
	public static void main(String[] args) 
	{
		Test33 t=new Test33();
		t.scan();
		t.calculate();
		
	}
}
