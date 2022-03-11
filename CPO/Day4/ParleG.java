

class ParleG
{	
	int id;
	String name;
	double sal;
	static String branchid="Transport";
	
	void setdata(int empid, String empname, double empsal)
	{
		id=empid;
		name=empname;
		sal=empsal;
		
	}
	
	void getdata()
	{
		System.out.println("Emp id ="+ id);
		System.out.println("Emp name ="+ name);
		System.out.println("Emp sal ="+ sal);
		System.out.println("Emp branchid ="+ branchid);
	}
		
		public static void main(String args[])
	{
		ParleG e1 = new ParleG();
		e1.setdata(111,"Amit",10000);
		e1.getdata();
		
		
	
	}
	
}
