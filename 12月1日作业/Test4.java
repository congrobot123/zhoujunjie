public class Test4
{
	public String[] opposite(String[] a)
	{
		int n=a.length;
		String instead=null;
		int i=0,j=0;
		for(double t=0;t<(a.length+1)/2;t++,i++,j++)
		{
			instead=a[i];
			a[i]=a[a.length-j-1];
			a[a.length-j-1]=instead;
		}
		return a;
	}
	public static void main(String[] args) 
	{
		String[] str=new String[]{"1","2","3"};
		Test4 t=new Test4();
		for(String temp :t.opposite(str))
		{
			System.out.print(temp);
		}
	}
}
