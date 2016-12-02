import java.util.Scanner;
class Test8 
{
	public static void main(String[] args) 
	{
		String text;
		Scanner sc=new Scanner(System.in);
		text=sc.next();
		if(text.equals("US"))
			System.out.println("welcome");
		else if(text.equals("CN"))
			System.out.println("»¶Ó­");
		else
			System.out.println(text);
	}
}
