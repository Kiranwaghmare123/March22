class BS
{
	public static int bsearch(int a1[],int x,int l, int r)
	{
		if(r>=l)
		{
				int mid=(l+(r-l))/2;
				if(a1[mid] == x)
						return mid;
				if(a1[mid] > x)
					return bsearch(a1,x,l,mid-1);
				return bsearch(a1,x,mid+1,r);
					
		}
		return -1;
			
	}
public static void main(String args[])
{
	int a1[]={2,4,7,9,15};
	int x=7;
	int n = a1.length;
	
	int result = bsearch(a1,x,0,n-1);
	
	if(result == -1)
		System.out.println("Element Not Found");
	else
		System.out.println("Element Found");
	
}

}