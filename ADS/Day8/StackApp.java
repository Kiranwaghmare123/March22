class Stack
{
	
	private int max;
	private long[] S1;
	private int top;
	
	Stack(int s)
	{
		top=-1;
		max=s;
		S1=new long[max];
	}
	
	public void push(long x)
	{
		S1[++top] = x;
	}
	
	public long pop()
	{
		return S1[top--];
	}
	
	public long peek()
	{
		return S1[top];
	}
	
	public boolean isEmpty()
	{
		return (top == -1);
	}
	
	public boolean isFull()
	{
		return (top >= (max-1));
	}
	
	public void display()
	{
		for(int i=0;i<=top;i++)
		{
			System.out.println(S1[i]);
		}
	}
	
}

class StackApp
{
	
	public static void main(String args[])
	{
		Stack s1 = new Stack(5);
		s1.push(11);
		s1.push(21);
		s1.push(31);
		s1.push(41);
		s1.push(51);
		s1.display();
		
		s1.pop();
		s1.display();
		s1.pop();
		s1.display();
		s1.pop();
		s1.display();
		
		
	}
}