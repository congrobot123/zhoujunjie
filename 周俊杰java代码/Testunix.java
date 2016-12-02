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
		System.out.println("CPU和Memory统计信息:");
		System.out.println("\t处理器数目:"+rt.availableProcessors()+"个数");
		System.out.println("\t空闲内存："+rt.freeMemory()/1000000+"MB"+"\t总内存:"+rt.maxMemory()/1000000+"MB");
		
		
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
			System.out.println("命令错误");

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
