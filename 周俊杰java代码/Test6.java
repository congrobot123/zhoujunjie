import java.util.Scanner;
class Test6 
{
	private static void aver(int[] a)
	{
		int aver=0;
		for(int i=0;i<10;i++)
			aver=aver+a[i];
		aver=aver/10;
		System.out.println("平均数:"+aver);
	}
	private static void max(int[] a)
	{
		int instead=a[0];
		for(int i=0;i<10;i++)
			if(instead<a[i])
				instead=a[i];
		System.out.println("最大数:"+instead);
	}
	private static void min(int[] a)
	{
		int instead=a[0];
		for(int i=0;i<10;i++)
			if(instead>a[i])
				instead=a[i];
		System.out.println("最小数:"+instead);
	}
	public static void main(String[] args) 
	{
		int[] a=new int[10];
		for(int i=0;i<10;i++)
		{
			Scanner sc=new Scanner(System.in);
			a[i]=sc.nextInt();
		}
		aver(a);
		max(a);
		min(a);

		//System.out.println("Hello World!");
	}
}
