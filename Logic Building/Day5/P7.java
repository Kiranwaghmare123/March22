
class P6
{
	public static void main(String args [])
	{	
		for(int i=1;i<=5;i++)//Row
		{int sum = 0;
			for(int j=1;j<=i;j++)//Column
			{
				sum+=j;//sum=sum+j
				System.out.print(j+" ");
			}
			System.out.print(" "+sum);
			//sum=0;
			System.out.println();
		}
		
	}
}

          
