public class Test4 
{
	public static void main(String[] args) 
	{
		int i,j,sum;
		for(i=1,j=1;j<=9;)
		{
			sum=i*j;
			if(i<=j)
			{
				System.out.print(j+"*"+i+"="+sum+" ");
				i++;
			}
			else 
			{
				System.out.println();
				//System.out.println(j+"*"+i+"="+sum);
				j++;
				i=1;
			}
		}
		//System.out.println("Hello World!");
	}
}
