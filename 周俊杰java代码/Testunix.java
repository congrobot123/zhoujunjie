import java.util.Date;
import java.text.DateFormat;
import java.util.Scanner;
import java.util.Locale;
class Testunix
{


	private void clear()
	{
		for(int i=0;i<30;i++)
			System.out.println();
	}
	private void date()
	{
		Date dt=new Date();
		DateFormat df,df1;

		df=DateFormat.getDateInstance(DateFormat.FULL,Locale.CHINA);
		df1=DateFormat.getTimeInstance(DateFormat.FULL,Locale.CHINA);	
		System.out.println(df.format(dt)+" "+df1.format(dt));
	}
	
	private void system()
	{
		Runtime rt=Runtime.getRuntime();
		System.out.println("CPU��Memoryͳ����Ϣ:");
		System.out.println("\t��������Ŀ:"+rt.availableProcessors()+"����");
		System.out.println("\t�����ڴ棺"+rt.freeMemory()/1000000+"MB"+"\t���ڴ�:"+rt.maxMemory()/1000000+"MB");
		
		
	}
	public void deal(String value)
	{
		if(value.equals("clear"))
			clear();
		else if(value.equals("date"))
			date();
		else if(value.equals("system"))
			system();
		else
			System.out.println("�������");

	}
	public static void main(String[] args) 
	throws Exception
	{
		String value;
		Test2 t=new Test2();
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			sc.useDelimiter("\n");

			System.out.print("C:\\Users\\zhoujunjie\\Desktop\\JavaCode\\src>");
			value=sc.next();
			value=value.substring(0,value.length()-1);
			if(value.length()!=0)
				t.deal(value);
		}
	}
}
