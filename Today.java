import java.util.Scanner;
import java.util.Random;
import java.util.TreeSet;
import java.util.Iterator;
public class Today 
{

	public static void main(String[] args) 
	{
		int value;
		Scanner sc=new Scanner(System.in);
		System.out.println("输入个数:");
		value=sc.nextInt();
		int[] radvalue=new int[value];
		Random rd=new Random();
		for(int i=0;i<value;i++)
			radvalue[i]=rd.nextInt(100);
		TreeSet set=new TreeSet((a,b)->{
											int a1=(int)a;
											int b1=(int)b;
											return a1>b1 ? -1 : a1<b1 ? 1 : 0;
										});
		for(int i=0;i<value;i++)
			set.add(radvalue[i]);
		Iterator it=set.iterator();
		int sum=0;
		boolean button=false;
		while (it.hasNext())
		{
			int i=0;
			radvalue[i]=(int)it.next();
			sum=sum+radvalue[i];
			if(!button)
			{
				System.out.println("集合数字:");
				button=true;
			}
			System.out.print(radvalue[i]+" ");
			i++;
		}
		System.out.print("\n");
		sum=sum/value;
		System.out.println("平均大小:"+sum);




	}
}
