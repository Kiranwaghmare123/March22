
class CmdArgs2
{
	public static void main(String args [])
	{	
		String s1 = args[0];
		String s2 = args[1];
		String s3 = args[2];
		
		int i = Integer.parseInt(s1);//Wrapper class
		int j = Integer.parseInt(s2);
		int k = Integer.parseInt(s3);
		
		//System.out.println("Argument= "+args[0]);
		//System.out.println("Argument= "+args[1]);
		//System.out.println("Argument= "+args[2]);
		System.out.println("Sum= "+(i+j+k));
		
	}
}


          
