import java.util.Scanner;
public class StringTest 
{public String M;
public String Sm;
public void scan()
	{Scanner sc=new Scanner(System.in);
		M=sc.next();
		Sm=sc.next();
}
public void calculate()
	{int t=0,j=0,k=0,i=0,s=0;
	char Mitem;
//while();
	for(i=0;i<M.length();i++)
	{
		Mitem=M.charAt(i);
		if(Mitem==Sm.charAt(0)&&i<=(M.length()-Sm.length()))
		for(j=0;j<Sm.length();j++)
			{if(Sm.charAt(j)!=M.charAt(i+j))
				break;
				t++;
			}
if (t==Sm.length())
		{k++;i+=Sm.length()-1;}
t=0;
}

System.out.println("count"+k);
}


	public static void main(String[] args) 
	{
		StringTest t=new StringTest();
		t.scan();
		t.calculate();
	}
}
