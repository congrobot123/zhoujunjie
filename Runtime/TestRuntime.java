public class TestRuntime
{
	public static void main(String[] args)
		throws Exception
	{
		Runtime rt = Runtime.getRuntime();
		//rt.exec("notepad.exe C:\\Users\\congrobot\\Desktop\\JavaCode\\src\\scanner\\abc.txt");
		
		System.out.println("处理器数量：" + rt.availableProcessors() );
		System.out.println("空闲内存数：" + rt.freeMemory());
		System.out.println("总内存数：" + rt.totalMemory());
		System.out.println("可用最大内存数：" + rt.maxMemory() );
	
	}
}
