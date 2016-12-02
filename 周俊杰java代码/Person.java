public class Person  
{
	head head;
	leg leg;
	arm arm;
	body body;
	Person(head head,leg leg,arm arm,body body)
	{
		this.head=head;
		this.leg=leg;
		this.arm=arm;
		this.body=body;
	}

	public static void main(String[] args) 
	{
		head h1=new head();
		leg l1=new leg();
		arm a1=new arm();
		body b1=new body();
		Person p=new Person(h1,l1,a1,b1);
	}
}
class head
{
	head()
	{
		System.out.println("head");
	}
}
class leg
{
	leg()
	{
		System.out.println("leg");

	}
}
class arm
{
	arm()
	{
		System.out.println("arm");
	}
}
class body
{
	body()
	{
		System.out.println("body");
	}
}