import java.util.*;

class Test
{
	int x=10;//class variable/instance variable
	
	public void display()
	{
		System.out.println("Hello CDAC Mumbai!!!");	
	}

	
	public static void main(String args[])
	{
		//create object:reference variable
		Test t1 = new Test();
		System.out.println(t1.x);
		t1.display();		
	}
}