import Zhoujunjie.Register;
import Zhoujunjie.Help;

import Zhoujunjie.CheckOption;
public class DosPhone 
{	
	private static DosPhone Dos=new DosPhone();
	private static int RegistSum; 
	private Register[] R;
	private Help H;
	private int Sum; 
	{
		H=new Help();
	}
	static
	{
		RegistSum=0;
	}
	
	public static void main(String[] args) 
	{
		
		//DosPhone Dos=new DosPhone();
		Dos.H.Helpprinter();
		Dos.InputOption();
			
	}
}
