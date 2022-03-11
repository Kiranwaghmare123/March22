

class ParleG2
{	
	int id;
	String name;
	double sal;
	static String branchid="Transport";
	
	void setdata(int id, String name, double sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
		
	}
	void setdata(int empid, String empname, double empsal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	
		
	}
	
	static void getdata()
	{
		System.out.println("Emp id ="+ id);
		System.out.println("Emp name ="+ name);
		System.out.println("Emp sal ="+ sal);
		System.out.println("Emp branchid ="+ branchid);
	}
		
		public static void main(String args[])
	{
		ParleG2 e1 = new ParleG2();
		ParleG2 e2 = new ParleG2();
		ParleG2 e3 = new ParleG2();
		e1.setdata(111,"Amit",10000);
		e1.getdata();
		
		e2.setdata(222,"Rahul",12000);
		e2.getdata();
		
		e3.branchid = "Account";
		e3.setdata(333,"Sarita",15000);
		e3.getdata();
		
		e1.setdata(333,"Sarita",15000);
		e1.getdata();
	
	}
	
}
