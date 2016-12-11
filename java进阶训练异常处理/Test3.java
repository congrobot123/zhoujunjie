public class Test3 
{
	public static void main(String[] args) 
	{

		double height=100,sum=0;
		for(int i=0;i<10;i++)
		{
			height=height/2;
			sum=sum+100+height*2;
		}
		sum-=(height*2);
		System.out.println("sum: "+sum+"\nheight: "+height);

		
	}
}
