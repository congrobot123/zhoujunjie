import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
public class TestQ 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Set s=new HashSet();
		for(int i=0;i<20;i++)
		{
			System.out.print("第"+(i+1)+"个数是:");
			s.add(sc.next());
		}
		for(Object temp : s)
			System.out.println(temp);
	}
}
