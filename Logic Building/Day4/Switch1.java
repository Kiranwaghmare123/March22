import java.util.Scanner;
class Switch1
{
	public static void main(String args [])
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter vowel:");
		char ch = sc.next().charAt(2);
		
		
		switch(ch)					
		{							
												
			case 'a': 
			case 'e': 
			case 'i': 
			case 'o': 
			case 'u': 
			System.out.println("vowel in lower case");break;
			case 'A': 
			case 'E': 
			case 'I': 
			case 'O': 
			case 'U': 
			System.out.println("vowel in upper case");break;
			default: System.out.println("not a vowel!!!");
					
		}
		System.out.println("Cdac Mumbai!!!");
		
	}
}


          
