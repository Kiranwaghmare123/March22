import java.util.*;
class Array10
{


	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a1[][]=new int[3][3];
		int b1[][]=new int[3][3];
		int c1[][]=new int[3][3];
		
	
		//Matrix Input 1
		for(int i=0;i<a1.length;i++){//Row
			for(int j=0;j<a1.length;j++){//Col
		
				System.out.print("Array elements:");
				a1[i][j]=sc.nextInt();//input 
				}
				//System.out.println();
		}
		//MAtrix Input 2
		for(int i=0;i<b1.length;i++){//Row
			for(int j=0;j<b1.length;j++){//Col
		
				System.out.print("Array elements:");
				b1[i][j]=sc.nextInt();//input 
				}
				//System.out.println();
		}
		//--------------------------------------------------
		//MAtrix Input 2
		for(int i=0;i<b1.length;i++){//Row
			for(int j=0;j<b1.length;j++){//Col
		
				c[i][j]= a[i][j]+b[i][j];
				}
				//System.out.println();
		}
		//-------------------------------------------------
		//Printing with for each Matrix 1
		for(int x[] : a1){
			for(int y : x){
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
		//Printing with for each Matrix 2
		for(int x[] : b1){
			for(int y : x){
				System.out.print(y+" ");
			}
			System.out.println();
		}
		//-------------------------------------------------
		
		//Resultant Matrix
		//Printing with for each Matrix 2
		for(int x[] : c1){
			for(int y : x){
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
		
	}
}