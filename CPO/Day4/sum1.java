class Operation
{
	int add(int x, int y)
	{
		int z = x+y;
		return z;
	}
}


class sum1
{
	public static void main(String args[])
	{
		//sum s1 = new sum();
		Operation o1 = new Operation();
		System.out.println(o1.add(10,20));
		int a = o1.add(10,20);
		System.out.println(a);
	}
}