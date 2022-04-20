//Finite Loop
class Recursion5
{	
//0 1 1 2  3  5 8....
	static int fibonacci(int n)//4
	{	
		if(n<=0)
				return 1;
//fib(n)=fib(n-1)+fib(n-2);
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
public static void main(String args[])
{	
	
	System.out.println("Enter series for 10 numbers:");
	for(int i=1;i<=10;i++)
	{
		System.out.println(fibonacci(i)+ " ");
		
	}
}

}