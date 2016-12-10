import java.util.Scanner;

class TreeUnit
{
	String data;
	TreeUnit left;
	TreeUnit right;
}
public class Test3 
{
	private TreeUnit head=null;
	private Scanner sc=null;
	private int depth=0;
	{
		//head=new TreeUnit();
		sc=new Scanner(System.in);
	}
	public TreeUnit create()
	{
		try
		{
			//depth++;
			System.out.println("depth:"+depth);
			System.out.println("please input:");
			String value=sc.next();
			if(!value.equals("null"))
			{
				depth++;
				TreeUnit t=new TreeUnit();
				t.data=value;
				t.left=create();
				t.right=create();
				depth-=2;
				return t;
			}
			else
			{
				//depth-=2;
				return null;
			}
		}
		catch (Exception e)
		{
			System.out.println("Enter wrong!");
		}
		return null;
		
	}
	public void reFirstSearch(TreeUnit t)
	{
		if(t!=null)
		{
			System.out.print(t.data+" ");
			reFirstSearch(t.left);
			reFirstSearch(t.right);
		}
		else
			System.out.print("null ");
	}

	public void firstSearch()
	{
		
	}


	public static void main(String[] args) 
	{
		Test3 t=new Test3();
		t.head=t.create();
		t.reFirstSearch(t.head);
	}
}
