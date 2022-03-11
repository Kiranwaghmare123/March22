class CDAC
{
	int m;
	double n;
	CDAC()//default Constructor
	{ 
		System.out.println("Default Constructor !!!");
	}
	CDAC( int x, double y)//default Constructor
	{ 
		m=x;
		n=y;
		System.out.println("Parametrized Constructor !!!"+m+" "+n);
	}
	CDAC( double y, int x)//default Constructor
	{ 
		m=x;
		n=y;
		System.out.println("Parametrized 2 Constructor !!!"+m+" "+n);
	}
 
	CDAC( int y, int x, int z)//default Constructor
	{ 
		m=x;
		int n1=y;
		int k=z;
		System.out.println("Parametrized 3 Constructor !!!"+n1+" "+m+" "+k);
	}
	public static void main(String args[])
	{
		CDAC c1 = new CDAC(23,45.6789);
		CDAC c2 = new CDAC(4,5,6);
		//CDAC c1 = new CDAC();//object create--> invoke default
		
	}
}