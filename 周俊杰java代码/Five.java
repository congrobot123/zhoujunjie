import java.util.Scanner;
public class Five
{private int Linenum;
public char[][] board;
public static int t;
{
Linenum=12;
board=new char[Linenum][Linenum];
for(int i=0;i<Linenum;i++)
for(int j=0;j<Linenum;j++)
board[i][j]='+';
} 
static
{
t=0;
}
public void printer()
{int i,j;
for(i=0;i<Linenum;i++)
for(j=0;j<Linenum;j++)
{
System.out.print(board[i][j]);
System.out.print(' ');
if(j==Linenum-1)
System.out.print('\n');
}
}

public void ChangeClient(int x,int y)
{
if(board[x-1][y-1]!='.'&&board[x-1][y-1]!='*')
	board[x-1][y-1]='.';
else
	{
		t=1;
		System.out.println("please scan again");
	}

}

public void ChangeCom(int x,int y)
{
if(board[x-1][y-1]!='.'&&board[x-1][y-1]!='*')
	board[x-1][y-1]='*';
else
	{
		t=0;
		System.out.println("please scan again");
	}

}

public boolean scan()
{
	int t,i,j,line=0,vertical=0,left=0,right=0;
	for(i=0;i<Linenum;i++)
	for(j=0;j<Linenum-1;j++)
	{
		if(board[i][j]==board[i][j+1]&&board[i][j]!='+')
			line++;
		else if(line==4)
			return true;
		else 
			line=0;

		if(board[j][i]==board[j+1][i]&&board[i][j]!='+')
			vertical++;
		else if(vertical==4)
			return true;
		else 
			vertical=0;

	}

//System.out.print(1);
	for(t=0;t<Linenum-4;t++)
	for(i=t,j=0;i<Linenum-1;j++,i++)
	{
		if(board[j][i]==board[j+1][i+1]&&board[j][i]!='+')
			left++;
		else if(left==4)
			return true;
		else 
			left=0;
	}

	for(t=0,left=0;t<Linenum-4;t++)
	for(i=0,j=t;j<Linenum-1;j++,i++)
	{
		if(board[j][i]==board[j+1][i+1]&&board[j][i]!='+')
			left++;
		else if(left==4)
			return true;
		else 
			left=0;
	}
//System.out.print(2);

//System.out.print(3);
	for(t=Linenum-1,right=0;t<Linenum-4;t++)
	for(i=Linenum-1,j=t;j<Linenum-1;j++,i--)
	{
		if(board[j][i]==board[j+1][i-1]&&board[j][i]!='+')
			right++;
		else if(right==4)
			return true;
		else 
			right=0;
	}

	return false;
}


public static void main(String[] args)
{
	int x=0,y=0;
	char result;
	Five k=new Five();
	k.printer();
	Scanner sc=new Scanner(System.in);
	while(!k.scan())
	{
		x=sc.nextInt();
		y=sc.nextInt();
		t++;
		if(t%2==0)
			k.ChangeClient(x,y);
		else
			k.ChangeCom(x,y);
		k.printer();
	}
	if(t%2==0)
		result='*';
	else
		result='.';
	System.out.println("Ê¤ÕßÎª:"+result);
}
}