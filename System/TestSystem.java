import java.util.Map;

public class TestSystem  
{
	public static void main(String[] args) 
	{
		/*
		Map<String, String> env = System.getenv();

		for(String name : env.keySet())
		{
			System.out.println(name + " ---> " + env.get(name));
		}
		*/

		System.out.println("PATH ---> " + System.getenv("PATH"));
		System.out.println("CLASSPATH ---> " + System.getenv("CLASSPATH"));
	}
}
