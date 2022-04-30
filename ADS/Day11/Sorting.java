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
public void heapsort(int a1[])
	{
		int n = a1.length;

		
		for (int i = n / 2 - 1; i >= 0; i--)
			heapify(a1, n, i);

		
		for (int i = n - 1; i > 0; i--) {
			
			int temp = a1[0];
			a1[0] = a1[i];
			a1[i] = temp;

			
			heapify(a1, i, 0);
		}
	}

	
	void heapify(int a1[], int n, int i)
	{
		int largest = i; 
		int l = 2 * i ; 
		int r = 2 * i + 1; 

		
		if (l < n && a1[l] > a1[largest])
			largest = l;

		
		if (r < n && a1[r] > a1[largest])
			largest = r;


		if (largest != i) {
			int temp = a1[i];
			a1[i] = a1[largest];
			a1[largest] = temp;

			heapify(a1, n, largest);
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

	void mergesort(int a1[],int l, int r)
	{
		if(l<r)
		{
			int m=l+(r-l)/2;
			mergesort(a1,l,m);
			mergesort(a1,m+1,r);
			merge(a1,l,m,r);
		}
	}
 void merge(int a1[], int l, int m, int r)
	{
		int n1= m-l+1;
		int n2= r-m;
		int L[] = new  int[n1];
		int R[] = new  int[n2];
		for(int i=0;i<n1;i++)
			L[i] = a1[l+i];
		for(int j=0;j<n2;j++)
			R[j] = a1[m+1+j];
		
		int i=0,j=0;
		
		int k=l;
		while(i<n1 && j<n2)
		{
			if(L[i] <= R[j])
			{
				a1[k]=L[i];
				i++;
			}
			else
			{
				a1[k]=R[j];
				j++;
			}
			k++;
				
		}
		
		while(i<n1)
		{
			a1[k] = L[i];
			i++;
			k++;
			
		}
		while(j<n2)
		{
			a1[k] = R[j];
			j++;
			k++;
			
		}
			
	}

	
void QuickSort(int[] a1, int low, int high)
	{
		if (low < high)
		{
			
			
			int pi = partition(a1, low, high);

			QuickSort(a1, low, pi - 1);
			QuickSort(a1, pi + 1, high);
		}
	}
 
  
  	
	static int partition(int[] a1, int low, int high)
	{
		
		int pivot = a1[high];
		int i = (low - 1);

		for(int j = low; j <= high - 1; j++)
		{
			

			if (a1[j] < pivot)
			{
				
				
				i++;
				swap(a1, i, j);
			}
		}
		swap(a1, i + 1, high);
		return (i + 1);
	}

	
	static void swap(int[] a1, int i, int j)
	{
		int temp = a1[i];
		a1[i] = a1[j];
		a1[j] = temp;
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
		int a1[]={5,3,8,4,6,9,2,7,11,45,89,67};
		
		int n = a1.length;
		//s1.bubbleSort(a1);
		//s1.selectionsort(a1);
		//s1.insertionsort(a1);
		//s1.mergesort(a1,0,n-1);
		//s1.QuickSort(a1,0,n-1);
		s1.heapsort(a1);
		
		s1.display(a1);
		
		
		
	}
}