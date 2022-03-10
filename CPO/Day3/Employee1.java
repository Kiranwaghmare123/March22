import java.util.*;

class Employee1
{
	int a=102;
	static int id =101;
	
	void display()
	{
		System.out.println("a="+a);
		System.out.println("id"+id);
	}
	
	
	public static void main(String args[])
	{
		Employee1 e1 = new Employee1();
		Employee1 e2 = new Employee1();
		Employee1 e3 = new Employee1();
		e1.display();
		
		e2.a=45;
		e2.id = 77;
		e2.display();
		e1.display();
		e3.id = 55;
		e1.display();
	}
}