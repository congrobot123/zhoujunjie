import java.util.Random;
class Test7 
{
	public static void main(String[] args) 
	{
		int i;
		Random rand=new Random();
		i=rand.nextInt(50);
		if(i<5)
			System.out.println("一等奖");
		else if(i<10&&i>=5)
			System.out.println("二等奖");
		else if(i>=10&&i<30)
			System.out.println("三等奖");
		else
		System.out.println("没中奖");
	}
}
