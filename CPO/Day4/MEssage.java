class MEssage
{
	MEssage()
	{
		this("Arvind");//Constructor chain
		System.out.println("Hi -----------!!!");
	}
	
	MEssage(String name)
	{
		
		System.out.println("Hi"+name+"!!!");
	}
	
	public static void main(String args[])
	{
		MEssage m = new MEssage();
		MEssage m1 = new MEssage("Radha");
	}
}