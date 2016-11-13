import java.util.Objects;

class TestObjects 
{
	public static void main(String[] args) 
	{
		String str = new String("hello world");
		System.out.println(str.toString());
		str = null;
		System.out.println(Objects.toString(str));
	}
}
