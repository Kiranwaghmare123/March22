import java.util.*;
class Array1
{

	public static void main(String args[])
	{
		int a1[] = new  int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<=4;i++){
		a1[i] = sc.nextInt();
		
		}
		
		
		
		for(int i=0;i<=4;i++){
		
		System.out.println("Array element = "+a1[i]);
		}
	}
}