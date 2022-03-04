import java.util.Scanner;
class Ternary
{
	public static void main(String args [])
	{	
				int n1=3;
				int n2=2;
				
				int max = (n1 < n2) ? n1 : n2;
				System.out.println("Maximum= "+max);
				
				int r=(n1>n2) ? (n1+n2):(n1-n2);
				System.out.println("Result= "+r);
				
				String s=(n1%2==0) ? "Even":"Odd";
				System.out.println("Result= "+s);
				
				boolean b=(n1%2==0) ? "true":"false";
				System.out.println("Result= "+b);
				
				
				
				
				
		
	}
}


          
