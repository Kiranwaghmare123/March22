//Finite Loop
class Recursion2
{	static int i=0;

	static void display()
	{	
		++i;
		if(i<=5)
		{
		System.out.println("Hi Everyone !!!");
		display();
		}
	}
	
public static void main(String args[])
{
	display();
}

}