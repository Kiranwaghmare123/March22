import java.util.*;
class Array5
{

	public static void main(String args[])
	{
		char ch='A';//ASCII value
		//Unicode character set : >256 & <=65536
		
		int x=97;
		System.out.println((int)ch);
		System.out.println((char)x);
		
		//character Literals
		char ch='a';//valid
		char ch="a";//CE: incompatible 
		char ch='ab';//CE
		/*for(int x: a1){
		
		System.out.println("Array element = "+x);
		}*/
	}
}