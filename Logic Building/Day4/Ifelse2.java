import java.util.Scanner;
class Ifelse2
{
	public static void main(String args [])
	{	
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Marks: ");
			int marks=sc.nextInt();
				
				if(marks > 65)// 55 > 65=> incorrect/false/no
				{
					System.out.println("First Division");//First Division
				}
				else
				{
					System.out.println("Fail");
					System.out.println("Reappear for Exam");
				}
				
				
		
	}
}


          
