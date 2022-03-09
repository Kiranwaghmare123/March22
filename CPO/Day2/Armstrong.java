import java.util.*;

class Armstrong
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int temp = n1;//153
		int res;
		int sum=0;
		while(n1>0)
		{
			res=n1%10;
			sum=sum+(res*res*res);
			n1=n1/10;
		}
				
		if(temp == sum)
				System.out.println("Armstrong Nunber");
		else
				System.out.println("Not an Armstrong Nunber");
		
	}
}