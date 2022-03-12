import java.util.*;
class Array7
{


	public static void main(String args[]){
		int a1[][]={{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0;i<a1.length;i++){//Row
			for(int j=0;j<a1.length;j++){//Col
		
				System.out.print(a1[i][j]+"  ");
				}
				System.out.println();
		}
		
	}
}