import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class FileTest 
{

	public static void main(String[] args) 
	throws Exception
	{
		{
		File file=new File("C:\\Users\\zhoujunjie\\Desktop\\JavaCode\\Filetest.txt");
		FileReader file1=(FileReader)file;
		//FileWriter out=new FileWriter("C:\\Users\\zhoujunjie\\Desktop\\JavaCode\\Filetest.txt");
		//out.write("hahahhaa");
		//out.close();
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\zhoujunjie\\Desktop\\JavaCode\\Filetest.txt"));
		System.out.println(br.readLine());
		}
		
		//System.out.println("Hello World!");
	}
}
