class Test4 
{
	
	public static void main(String[] args) 
	{
		String[] Arrayvalue=new String[8];
		int[] temp=new int[8];
		String value="A1B2C3D4E5F6G7H8";
		//Arrayvalue=value.split(\p);
		
		for(int i=0;i<8;i++)
		{
			temp[i]=Integer.parseInt(String.valueOf(value.charAt(2*i+1)));
		}
		for(int t:temp)
		System.out.println(t);
		for(int i=0;i<8;i++)
		{
			Arrayvalue[i]=String.valueOf(value.charAt(2*i));
		}
		for(String t:Arrayvalue)
		System.out.println(t);
	}
}
