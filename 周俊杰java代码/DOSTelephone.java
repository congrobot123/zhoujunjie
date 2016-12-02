import java.util.Scanner;
//import Register.java;
public class DOSTelephone
{
	public boolean Whetherlogin=false;
	public static int RegistSum; 
	public static Register admin;
	//public Login log;
	public Register[] regist=new Register[10];
	public static Login t;
	static
	{
		t=new Login();
		admin=new Register();
		//log=new Login(); 
		RegistSum=0;
	
	
		admin.Username="admin";
		admin.Password="123456";
		admin.Sex="ÄÐ";
	}
	
	void Read()
	{
		
		System.out.println("                Username    Password    Sex");
		for(int i=0;i<RegistSum;i++)
		{
			System.out.println((i+1)+":               "+regist[i].Username+"   "+regist[i].Password+"    "+regist[i].Sex);
			
		}
	}
	void Delete()
	{
		int k=0;
		boolean Thischeck=false;
		String username;
		Scanner sc=new Scanner(System.in);
		System.out.println("please input the username:");
		username=sc.next();
		for(int i=0;i<RegistSum;i++)
		{
			if(regist[i].Username.equals(username))
			{
				k=i;
				Thischeck=true;
			}

		}
		
		if(Thischeck)
		{
			for(int i=k;i<RegistSum-1;i++)
			{
				regist[i]=regist[i+1];
			}
			RegistSum--;
			System.out.println("Delete in success");
		}
		else
			System.out.println("This username is not in existence");
	}
	
	{
		for(int i=0;i<10;i++)
		regist[i]=new Register();
	}
		
	void Help()
	{
		System.out.println("Usages:");
		System.out.println("1.  Register   <Need yourUsername Password and Sex>               .....");
		System.out.println("2.  Login   <Need your Username and Password>              ......" );
		System.out.println("3.  clear");
		System.out.println("4.  quit");
		System.out.println("\n");
		System.out.println("Options:");
		System.out.println("1.  -Help  (Get menu)");
		System.out.println("2.  -D  (Delete the specified 'part',but after you login in success)");
		System.out.println("3.  -S  (look up client in existence,but after you login in success)");
		System.out.println("4.  -R  (register your account)" );
		System.out.println("5.  -L  (login your account)");
		System.out.println("6.  -A  (login in administrater)");
		System.out.println("Examples:");
		System.out.println("1.  Register >eg."+"\n"+"Username:zhoujunjie"+"\n"+"Password:123456"+"\n"+"Sex:ÄÐ");
		System.out.println("2.  Login >eg."+"\n"+"Username:zhoujunjie"+"\n"+"Password:123456");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}
	void Startprinter()
	{
		System.out.println("                              Welcome to Wechat Phone Book System");
		System.out.println("                                                                                               by zhoujunjie");
	}
	public boolean HelpOption(String HelpValue)
	{


		if(HelpValue.equals("Help"))
		{
			Help();
			return true;
		}
		else if(HelpValue.equals("clear"))
		{
			for(int i=0;i<35;i++)
			{
				System.out.println("");
			}
			return true;
		}
		else if(HelpValue.equals("S"))
		{
			if(Whetherlogin==true)
				t.Read();
			else
				System.out.println("please it is first to login");
			return true;
		}
		else if(HelpValue.equals("D"))
		{
			if(Whetherlogin==true)
				t.Delete();
			else
				System.out.println("please it is first to login");
			return true;
		}

		else if(HelpValue.equals("A"))
		{
			try
			{
				if(t.Checkadmin())
				{
					Whetherlogin=true;
					
					System.out.println("Login in success ");
					return true;
				}
				else
						System.out.println("Login in false");
			}
			catch(Exception e)
			{
				System.out.println("EXCEPTION");
			}
				
			return true;
		}
		
		else if(HelpValue.equals("L"))
		{
			
			try
			{
				if(t.check())
				{
					
					System.out.println("Login in success ");
					
				}
				else
						System.out.println("Login in false");
			}
			catch(Exception e)
			{
				System.out.println("EXCEPTION");
			}
				
			return true;
		}
		else if(HelpValue.equals("R"))
		{
			while(true)
			{
				try
				{
					t.regist[RegistSum].scan();
					RegistSum++;
					for(int i=0;i<RegistSum-1;i++)
					{
						if(t.regist[i].Username.equals(t.regist[RegistSum-1].Username))
						{
							t.regist[RegistSum]=null;
							RegistSum--;
							System.out.println("the username had been register by others");
							return true;
						}
					}
					
					//System.out.println(t.regist[RegistSum].Username);
					
					break;
				}
				catch(Exception ie)
				{
					System.out.println("Your password must be numbers,and please input again");
						
				}
				//System.out.println("www");
				
			}


			return true;
		}
		else if(HelpValue.equals("\r"))
			return true;
		else if(HelpValue.equals("quit"))
			return false;
		else if(HelpValue.equals(""))
			return true;
			System.out.println("Your message is false,please input again£¡");
		return true;
	}
	
	public static void main(String[] args) 
	{
		String HelpValue=null;
		boolean HO;
		t.Startprinter();
		Scanner sc=new Scanner(System.in);
		sc.useDelimiter("\n");
		t.Help();
		while(true)
		{
			if(HelpValue==null)
			{
				System.out.print("zhoujumjie@menghui:^$");
				HelpValue=sc.next();
				HelpValue=HelpValue.substring(0,HelpValue.length()-1);
				HO=t.HelpOption(HelpValue);
				HelpValue=null;
				if(!HO)
					break;
			}
		}	
		
	}
}
class Login extends DOSTelephone
{   
	
	public String Username;
	public String Password;
	public boolean Checkadmin()
	{
		String Username;
		String Password;
		Scanner sc=new Scanner(System.in);
		System.out.print("please input Your Username:");
		Username=sc.next();
		System.out.print("Please input Your Password:");
		Password=sc.next();
		
		if(Username.equals(admin.Username)&&Password.equals(admin.Password))
		{
		//	System.out.println("true");
			return true;
		}
		else
		return false;
	}

	public boolean check()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("please input Your Username:");
		Username=sc.next();
		System.out.print("Please input Your Password:");
		Password=sc.next();
		//System.out.println(regist[0].Password);
		for(int i=0;i<RegistSum;i++)
		if(Username.equals(regist[i].Username)&&Password.equals(regist[i].Password))
		{
		//	System.out.println("true");
			return true;
		}
		return false;
	}
	
	public void printer()
	{
		System.out.println("Login:"+"\n"+"password:");
	}

}
class Register
{
	String Username;
	String Password;
	String Sex;
	public void scan()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("please input Your Username:");
		Username=sc.next();
		System.out.print("Please input Your Password:");
		Password=sc.next();
		System.out.print("please input your Sex:");
		Sex=sc.next();
	}
	void printer()
	{
		int t;
		
		System.out.println("Please input Username and Password");
		
	}
}
