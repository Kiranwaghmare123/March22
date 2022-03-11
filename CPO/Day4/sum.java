class Operation
{
	void add(int x, int y)
	{
		int z = x+y;
		System.out.println(z)
	}
}


class sum
{
	public static void main(String args[])
	{
		//sum s1 = new sum();
		Operation o1 = new Operation();
		o1.add(10,20);
	}
}