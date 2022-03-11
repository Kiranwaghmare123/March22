class CDAC1
{
	int m;
	double n;
	CDAC1()//default Constructor
	{ 
		m=5;
		System.out.println("Default Constructor !!!");
	}
	CDAC1( int x, double y)
	{ 
		m=x;
		n=y;
		System.out.println("Parametrized Constructor !!!"+m+" "+n);
	}
	
	void display()
	{
		System.out.println("Function !!!" + m);
	}
	
	public static void main(String args[])
	{
		
		CDAC1 c1 = new CDAC1();//object create--> invoke default
		c1.display();
		CDAC1 c2 = new CDAC1(8,9);
		c2.display();
	}
}