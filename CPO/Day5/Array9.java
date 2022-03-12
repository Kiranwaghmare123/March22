import java.util.*;
class Array8
{


	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a1[][]=new int[3][3];
		
	
		
		for(int i=0;i<a1.length;i++){//Row
			for(int j=0;j<a1.length;j++){//Col
		
				System.out.print("Array elements:");
				a1[i][j]=sc.nextInt();//input 
				}
				//System.out.println();
		}
		//Printing with for each
		for(int x[] : a1){
			for(int y : x){
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
		
	}
}