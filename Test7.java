import java.util.Random;
class Test7 
{
	public static void main(String[] args) 
	{
		int i;
		Random rand=new Random();
		i=rand.nextInt(50);
		if(i<5)
			System.out.println("һ�Ƚ�");
		else if(i<10&&i>=5)
			System.out.println("���Ƚ�");
		else if(i>=10&&i<30)
			System.out.println("���Ƚ�");
		else
		System.out.println("û�н�");
	}
}
