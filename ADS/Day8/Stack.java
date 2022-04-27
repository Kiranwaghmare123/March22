class Stack
{
	static final int Max=10;//size of stack
	int top;
	int s[] = new int[Max];//Maximum size of stack
	
	Stack()
	{
		top = -1;// to initialize the top
	}
	
	//to check stack is empty
	boolean isEmpty()
	{
		return (top < 0);
	}
	
//To perform insertion operation : PUSH	
	boolean push(int x)
	{
		if(top >= Max-1){
			System.out.println("Overflow !!!");
			return false;
		}
		else {
		
			s[++top] = x;
			System.out.println(x+"----> Push operation!!!");
			return true;
		
		}
			
	}
//To perform deletion operation : POP
	
	int pop()
	{
		if(top < 0){
		System.out.println("Underflow !!!");
		return 0;
		}
		else{
			int x = s[top--];
			return x;
		}
	}

//To get the current status of TOP
int peek()
{
	if(top < 0){
		System.out.println("Underflow !!!");
		return 0;
		}
	else{
		int x = s[top];
		return x;
	}
}

	
	public static void main(String args[])
	{
		Stack s1 = new Stack();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		System.out.println(s1.pop()+ " Popped from stack !");
		
	}
}