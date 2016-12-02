package Zhoujunjie;

import java.util.Scanner;
public class Register
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
	public void printer()
	{
		int t;
		
		System.out.println("Please input Username and Password");
		
	}
}
