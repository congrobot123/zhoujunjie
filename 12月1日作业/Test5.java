import java.math.BigDecimal;
public class Test5 
{
	private String match(int a)
	{
		String str;
		if(a==1)
		{
			str="Ҽ";
		}
		else if(a==2)
		{
			str="��";
		}
		else if(a==3)
		{
			str="��";
		}
		else if(a==4)
		{
			str="��";
		}
		else if(a==5)
		{
			str="��";
		}
		else if(a==6)
		{
			str="½";
		}
		else if(a==7)
		{
			str="��";
		}
		else if(a==8)
		{
			str="��";
		}
		else if(a==9)
		{
			str="��";
		}
		else if(a==0)
		{
			str="��";
		}
		else 
			str="^";
		return str;
	}
	public void print(int num)
	{
		String str;
		if(num==0)
			return;
		else
		{
			int[] a=new int[5];
			a[0]=num/10000;
			a[1]=(num-a[0]*10000)/1000;
			a[2]=(num-a[0]*10000-a[1]*1000)/100;
			a[3]=(num-a[0]*10000-a[1]*1000-a[2]*100)/10;
			a[4]=num%10;
			if(a[1]!=0)
			{	
				str=match(a[1])+"Ǫ";

			}
			else
			{
				str=match(a[1]);
			}
			if(a[2]!=0)
			{
				str=str+match(a[2])+"��";
			}
			else 
			{
				str=str+match(a[2]);
			}

			if(a[3]!=0)
			{
				str=str+match(a[3])+"ʰ";
				
			}
			else
			{
				str=str+match(a[3]);
			}

			if(true)
			{
				str=str+match(a[4]);
				//System.out.println(str);
			}
			
			char[] Schar=new char[str.length()];
			Schar=str.toCharArray();
			for(int i=0;i<str.length()-1;i++)
			{
				if(Schar[i]=='��'&&Schar[i]==Schar[i+1])
				{
					Schar[i]=' ';
				}
			}
			for(int i=0;i<str.length();i++)
			{
				if(Schar[i]=='��')
				{
					Schar[i]=' ';
					break;
				}
			}
			if(Schar[Schar.length-1]=='��')
			{
				Schar[Schar.length-1]=' ';
			}
			String sinstead=null;
			int mark1=0;
			for(int i=0;i<str.length();i++)
			{
				if(Schar[i]!=' '&&mark1==0)
				{
					sinstead=String.valueOf(Schar[i]);
					mark1++;
				}
				else if(Schar[i]!=' ')
					sinstead=sinstead+String.valueOf(Schar[i]);
			}
			System.out.print(sinstead);
			
		}
	}
	
	public void print1(float a)
	{
		
		String str1=null;
		int instead=0;
		String str=Float.toString(a);
		char[] Schar=new char[str.length()];
		Schar=str.toCharArray();
		str1=String.valueOf(Schar[2]);
		instead=Integer.parseInt(str1);
		str=null;
		if(instead!=0)
			str=match(instead)+"��";

		str1=String.valueOf(Schar[3]);
		instead=Integer.parseInt(str1);
		
		if(instead!=0&&str!=null)
			str=str+match(instead)+"��";
		else
			str=match(instead)+"��";
		System.out.print(str);
	}
	public void transform(String str)
	{
		boolean button=false;
		char[] Schar=new char[str.length()];
		Schar=str.toCharArray();
		int i=0;
		int money=0;
		float money1=0,pointnum=0;
		String money2=null;
		while(i<Schar.length)
		{
			if(Schar[i]=='.')
			{
				button=true;
			}
			i++;
		}
		//System.out.println(button);
		try
		{
			if(button)
			{
				int instead;

				money1=Float.parseFloat(str);
				
				instead=(int)money1;

				pointnum=money1-(float)instead;
				BigDecimal n=new BigDecimal(pointnum);
				pointnum=n.setScale(2,BigDecimal.ROUND_HALF_UP).floatValue();

				//System.out.println(pointnum);
				if(instead/10000==0)
				{
					print(instead);
					print1(pointnum);
				}
				else
				{
					print(instead/10000);
					System.out.print("��");
					print(instead%10000);
					print1(pointnum);
				}
			}
			else
			{
				
				money=Integer.parseInt(str);
				//System.out.println(money);
				if((money/10000)==0)
					print(money);
				else
				{
					print(money/10000);
					System.out.print("��");
					print(money%10000);
				}
			}
			
			
		}
		catch (Exception e)
		{
			System.out.println("enter wrong");
			e.printStackTrace();
		}

	}
	public static void main(String[] args) 
	{
		String str="��1000110.11";
		char[] Schar=new char[str.length()];
		Schar=str.toCharArray();
		int mark=0;
		str=null;
		for(int i=1;i<Schar.length;i++)
		{
			if(i==1)
				str=String.valueOf(Schar[i]);
			else
				str=str+String.valueOf(Schar[i]);
		}
		Test5 t=new Test5();
		System.out.println(str);
		t.transform(str);
	}
}
