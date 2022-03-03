import java.util.Scanner;
class Scan2
{
	public static void main(String args [])
	{	
		Scanner sc = new Scanner("123 321");//Declaration of Scanner class object
		//System.out.println("Enter interger number1:");//Msg
		int n1 = sc.nextInt();//Getting the input from user
		
		//System.out.println("Enter interger number2:");//Msg
		int n2 = sc.nextInt();//Getting the input from user
		
		
		
		int k = n1+n2;
		System.out.println("Display Sum= "+k);
		
	}
}


          
