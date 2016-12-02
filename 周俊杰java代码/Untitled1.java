public class Report 
{
	public static void main(String[] args) 
	{
		for(int i=2;i<100;i++)
		{
			int instead =i;
			
			{
				int[] value= new int[instead];
				int t=1;
				int e=0;
				int ans=0;
				while(true)
				{
					for(int j=0;j<value.length;j++)
					{
						if(value[j]==4)
							continue;
						value[j]=t;
						t++;
						if(t==4)
							t=1;
					
					}
					for(int j=0;j<value.length;j++)
					{
						if(value[j]==3)
							value[j]=4;
					}
					
					for(int j=0;j<value.length;j++)
					{
						
						if(value[j]==4)
							e++;
						else
							ans=value[j];
						
			
					}
					if(e==value.length-1)
					{
						System.out.println(ans);
						break;
					}
					e=0;
					ans=0;
				}

			}
		
		}
	}
}
