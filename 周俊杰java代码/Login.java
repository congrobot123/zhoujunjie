package Zhoujunjie;

class Login 
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
		void Read()
	{
		
		System.out.println("                Username    Password    Sex");
		for(int i=0;i<RegistSum;i++)
		{
			System.out.println((i+1)+":               "+regist[i].Username+"   "+regist[i].Password+"    "+regist[i].Sex);
			
		}
	}
}
