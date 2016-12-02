import java.util.*;
import java.util.Map;
public class Mazetest
{private int[][] Num;
private int Size_length;
private int Size_width;
public int[][] way;
public int DestinationX;
public int DestinationY;
public void printer()
{
for(int width=0;width<Size_width;width++)
for(int length=0;length<Size_length;length++)
{
System.out.print(way[width][length]);
if(length==Size_length-1)
System.out.println('\r');
}
}
public void GivenValue()
{int i,width,length;
Scanner sc=new Scanner(System.in);
Size_length=sc.nextInt();
Size_width=sc.nextInt();
DestinationX=sc.nextInt();
DestinationY=sc.nextInt();
Num=new int[Size_width][Size_length];
for(width=0;width<Size_width;width++)
for(length=0;length<Size_length;length++)
{
Num[width][length]=sc.nextInt();
System.out.print(Num[width][length]);

if(length==Size_length-1)
System.out.println('\r');
}
int[][] way=new int[Size_width][Size_length];
way=Num;
}
private int[] judge(int[][] way1,int x,int y)
{int[] Addone={0,0,0,0}; 
if(way1[y-1][x]==1)
Addone[0]=1;
else if(way1[y][x+1]==1)
Addone[1]=1;
else if(way1[y+1][x]==1)
Addone[2]=1;
else if(way1[y][x-1]==1)
Addone[3]=1;
return Addone;//依次上右下左可走方向
}
private void direction(int x,int y)
{int i;
for(i=0;i<4;i++)
if(judge(way,x,y)[i]==0)
break;
if(i==0)
y--;
if(i==1)
x++;
if(i==2)
y--;
if(i==3)
x--;
Firstsearch(x,y);
}

public boolean Firstsearch(int x,int y)
{int t=0;//*
if(x==DestinationX&&y==DestinationY)
return true;
else
{for(int i=0;i<4;i++)
if(judge(way,x,y)[i]==1)
t++;
if(t==3)
way[y][x]=1;
t=0;
direction(x,y);
return false;
}
} 
public static void main(String[] args)
{Mazetest target=new Mazetest();
target.GivenValue();
if(target.Firstsearch(0,0))//起始地址（）
{System.out.println("图解如下");
target.printer();}
}
}
