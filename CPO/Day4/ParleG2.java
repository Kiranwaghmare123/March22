

class ParleG1
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
		ParleG1 e1 = new ParleG1();
		ParleG1 e2 = new ParleG1();
		ParleG1 e3 = new ParleG1();
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
