import java.util.Map;
import java.util.HashMap;
import java.util.Set;
public class TestR
{
	public static void main(String[] args) 
	{
		Map map=new HashMap();
		map.put("a",3);
		map.put("b",4);
		map.put("c",2);
		for(Object set : map.entrySet())
		{
			System.out.println(set);
		}
		
	}
}
