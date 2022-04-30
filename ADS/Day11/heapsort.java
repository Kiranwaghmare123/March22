

public class heapsort {
	public void sort(int a1[])
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

	
	static void display(int a1[])
	{
		int n = a1.length;
		for (int i = 0; i < n; ++i)
			System.out.print(a1[i] + " ");
		System.out.println();
	}


	public static void main(String args[])
	{
		int a1[] = { 22, 11, 33, 55, 66, 77 ,99,5 };
		int n = a1.length;

		heapsort ob = new heapsort();
		ob.sort(a1);

		System.out.println("Sorted array is");
		display(a1);
	}
}


Insertion Sort:
----------------
void insertionsort(int a1[])
{
	int n=a1.length;
	for(int i=1;i<n;i++)
	{
		int key = a1[i];
		int j= i-1;//0
		
		while(j>=0 && a1[j] > key)
		{
				a1[j+1] = a1[j];
				j=j-1;
		}
		a1[j+1] = key;
	}
}