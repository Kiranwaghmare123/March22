

class Function3
{	int m ;
		
		void display()
		{
			System.out.println("Userdefined method....");
		}
		void display1()
		{
			//int m ;
			System.out.println("Userdefined method...."+m);
		}
	public static void main(String args[])
	{
		Function3 f1 = new Function3();
		f1.display();
		f1.display1();
		
	}
}