class Sorting
{
	void bubbleSort(int a1[])
{
	int n = a1.length;
	for(int i=0;i<n-1;i++)
	{
		for(int j=0;j<n-i-1;j++)
		{
			if(a1[j] > a1[j+1])
			{
				int temp = a1[j];
				a1[j]=a1[j+1];
				a1[j+1]=temp;
			}
		}
		
	}
}

void selectionsort(int a1[])
{
	int n = a1.length;
	for(int i=0;i<=n-1;i++)
	{
		int min=i;
		for(int j=i+1;j<n;j++)
		{
			if(a1[j] < a1[min])
				min = j;
		}
		//swapping
				int temp = a1[min];
				a1[min] = a1[i];
				a1[i]=temp;
		
				
			
	}

}

void insertionsort(int a1[])	
{
	int n = a1.length;
	for(int i=1;i<n;i++)
	{
		int k = a1[i];
		int j = i-1;
		
		while(j>=0 && a1[j]>k)
		{
			a1[j+1]=a1[j];
			j=j-1;
			
			
		}
		a1[j+1]=k;
	}
}

	void display(int a1[])
	{
		int n = a1.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(a1[i]+" ");
		}
	}
	

	
	
		public static void main(String args[])
	{
		
		Sorting s1 = new Sorting();
		int a1[]={5,3,8,4,6,9,2,7};
		//s1.bubbleSort(a1);
		//s1.selectionsort(a1);
		s1.insertionsort(a1);
		s1.display(a1);
		
		
		
	}
}