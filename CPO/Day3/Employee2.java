import java.util.*;

class Employee2
{
	int a;
	static int id;
	
	void display()
	{
		System.out.println("a="+a);
		System.out.println("id="+id);
	}
	
	
	public static void main(String args[])
	{
		Employee2 e1 = new Employee2();
		Employee2 e2 = new Employee2();
		Employee2 e3 = new Employee2();
		e1.display();
		
		e2.a=45;
		e2.id = 77;
		e2.display();
		e1.display();
		e3.id = 55;
		e1.display();
	}
}