public class Test1
{	
	public static String pushArray(String str,int value)
	{
		int i=0;
		char[] c=str.toCharArray();
		for(;i<str.length();i++)
		{
			if((int)c[i]<=256)
				value--;
			else 
				value-=2;
			if(value==0)
				break;
			else if(value<0)
			{
				i--;
				break;
			}
		}

		return String.copyValueOf(c,0,(i+1));
	}
	public static void main(String[] args) 
	{
		String str="��ABC��DEF";
		System.out.println(Test1.pushArray(str,6));

	}
}
