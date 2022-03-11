class CDAC2
{
	int m;
	double n;
	CDAC2()//default Constructor
	{ 
		m=5;
		System.out.println("Default Constructor !!!");
	}
	CDAC2( int m, double n)
	{ 
		this.m=m;
		this.n=n;
		System.out.println("Parametrized Constructor !!!"+m+" "+n);
	}
	
	void display()
	{
		System.out.println("Function !!!" + m);
	}
	
	public static void main(String args[])
	{
		
		CDAC2 c1 = new CDAC2();//object create--> invoke default
		c1.display();
		CDAC2 c2 = new CDAC2(8,9);
		c2.display();
	}
}