package Zhoujunjie.CheckOption;
class Help extends CheckOption
{
	public void Startprinter()
	{
		System.out.println("                              Welcome to Wechat Phone Book System");
		System.out.println("                                                                                               by zhoujunjie");
	}
	public void Helpprinter()
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
		System.out.println("1.  Register >eg."+"\n"+"Username:zhoujunjie"+"\n"+"Password:123456"+"\n"+"Sex:��");
		System.out.println("2.  Login >eg."+"\n"+"Username:zhoujunjie"+"\n"+"Password:123456");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}
}
