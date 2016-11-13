import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class TestRandom
{
	public static void main(String[] args) 
	{
		Random rand = new Random();
		int a = rand.nextInt(10000);

		if(a >=0 && a<=10)
		{
			System.out.println("你获得一等奖");
		}
		else if(a >10 && a<100)
		{
			System.out.println("你获得二等奖");
		}
		else if(a >= 100 && a<1000)
		{
			System.out.println("你获得三等奖");
		}
		else
		{
			System.out.println("谢谢参与");
		}


		Random r1 = new Random(1000);
		System.out.println(r1.nextBoolean());
		System.out.println(r1.nextInt());

		Random r2 = new Random(1000);
		System.out.println(r2.nextBoolean());
		System.out.println(r2.nextInt());

		Random r3 = new Random(System.currentTimeMillis());
		System.out.println(r3.nextInt());

		ThreadLocalRandom r4 = ThreadLocalRandom.current();
		System.out.println(r4.nextInt());

	}
}
