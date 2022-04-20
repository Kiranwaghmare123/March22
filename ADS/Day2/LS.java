class LS
{
	public static int lsearch(int a1[],int x)
	{
		int n=a1.length;
		for(int i=0;i<n;i++)
		{
			if(a1[i] == x)
				return i;
		}
		return -1;
	}
public static void main(String args[])
{
	int a1[]={2,4,7,9,5};
	int x=5;
	
	int result = lsearch(a1,x);
	
	if(result == -1)
		System.out.println("Element Not Found");
	else
		System.out.println("Element Found");
	
}

}