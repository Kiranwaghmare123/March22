
class P9
{
	public static void main(String args [])
	{	
		for(int i=1;i<=5;i++)//Row
		{
			for(int l=4;l>=i;l--)//Column 
			{
				System.out.print("  ");
				
			}
			for(int j=1;j<=i;j++)//Column 
			{
				System.out.print(j+" ");
				
			}
			
			for(int k=i-1;k>=1;k--)//Column 
			{
				System.out.print(k+" ");
				
			}
			System.out.println();
		}
		
	}
}

          
