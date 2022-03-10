

class Function5
{	//int m =10;
	static int m =30;
		
		void display()
		{
			System.out.println("Userdefined method...."+m);
		}
		void display(int x, float y)
		{
			int m = x;
			int n = y;
			System.out.println("Userdefined method1...."+(m+n));
		}
		void display(int x, int y,int z)
		{
			int m = x;
			int n = y;
			int p = z;
			System.out.println("Userdefined method2...."+(m+n+p));
		}
	public static void main(String args[])
	{
		Function5 f1 = new Function5();
		f1.display();
		f1.display(5,8);
		f1.display(45,18);
		
	}
}