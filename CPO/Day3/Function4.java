

class Function4
{	//int m =10;
	static int m =30;
		
		void display()
		{
			System.out.println("Userdefined method...."+m);
		}
		void display1()
		{
			int m =20;
			System.out.println("Userdefined method...."+m);
		}
	public static void main(String args[])
	{
		Function4 f1 = new Function4();
		f1.display();
		f1.display1();
		
	}
}