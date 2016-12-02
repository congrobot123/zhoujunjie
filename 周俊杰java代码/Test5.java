import java.io.BufferedReader;
import java.io.FileReader;
class Test5
{
	
	public static void main(String[] args) 
	throws Exception
	{
		FileReader file=new FileReader("C:\\Users\\zhoujunjie\\Desktop\\javaclone\\def.txt");
		BufferedReader dt=new BufferedReader(file);
		String text;
		//String[] array1=new String[2];
		int value,t=0;
		int[] array=new int[2];
		dt.mark(0);
		do
		{
			dt.reset();
			text=dt.readLine();
			dt.mark(t++);
			//System.out.println(text);
			for(int i=0;i<2;i++)
			{
				array[i]=Integer.parseInt(text.split(" ")[i]);
			}
			value=array[0]*array[1];
			System.out.println(array[0]+"*"+array[1]+"="+value);
		}
		while(dt.readLine()!=null);
	}
}
