public class Test1 
{
	public char[] spilt(String str)
	{
		char[] Schar=null ;
		Schar=str.toCharArray();
		int mark=0,num=32,pointnum=0;;
		int[] pointmark=new int[num];
		while(mark<Schar.length)
		{
			if(Schar[mark]==',')
			{
				pointmark[pointnum]=mark;
				pointnum++;
			}
			mark++;
		}
		int i=0,j=0,t=0;
		char[] instead=new char[Schar.length-pointnum];
		while(j<Schar.length)
		{
			if(j==pointmark[t])
			{
				j++;
				t++;
				continue;
			}
			else
				instead[i]=Schar[j];
			i++;
			j++;
			
		}
		return instead;
	}
	public static void main(String[] args) 
	{
		
		
		String str="zhou,jun,jie";
		Test1 t=new Test1();
		for(char temp :t.spilt(str))
		{
			System.out.print(temp);
		}
	}
}
