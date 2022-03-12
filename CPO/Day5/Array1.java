import java.util.*;
class Array1
{

	public static void main(String args[])
	{
		int a1[] = new  int[5];//array declared
		Scanner sc = new Scanner(System.in);//user input 
		
		for(int i=0;i<=4;i++){//total 5 elements:0 to 4
		System.out.println("Enter Array elements ["+i+"] : ");
		a1[i] = sc.nextInt();
		
		}
		
		
		
		for(int i=0;i<=4;i++){
		
		System.out.println("Array element = "+a1[i]);
		}
	}
}