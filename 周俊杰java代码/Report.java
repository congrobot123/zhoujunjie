public class Report 
{
	public static void main(String[] args) 
	{
		for(int i=2;i<10;i++)
		{
			int instead =i;
			
			{
				int[] value= new int[instead];
				int t=1;
				int e=0,c=0;
				int ans=0;
				while(true)
				{
					for(int j=0;j<value.length;j++)
					{
						if(value[j]==4)
						{
							continue;
						}
						else
						{
							for(int k=0;k<value.length;k++)
							{
								
								if(value[k]==4||value[k]==3)
									c++;
							//System.out.println("c"+c);
							}
							if(value.length-c==1)
								break;
							value[j]=t;
							t++;
							if(t==4)
								t=1;
						//System.out.println(j+" "+value[j] );
						}
						c=0;
						//System.out.println(j+" "+value[j] );
					
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
						//System.out.println(value[1]);	
			
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
