Day 2 :  20/04/2022
Topic : Arrays
---------------------------------------------	
	-Array
	-Searching Techniques
	-Recursion
	
Searching:
-----------
1. Linear search


	int lsearch(int a1[],int x)
	{
		int n=a1.length;
		for(int i=0;i<n;i++)
		{
			if(a1[i] == x)
				SOP(Found)
			else
				SOP(Not Found)
		}
		
	
	
	}
2. Binary search

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

Recursion:
-----------
-Function which calls itself 
directly or indirectly is called Recursion.
-solves the problem by calling 
a copy of iteself to work on a smaller problem.
-always ensure that the recursion terminates.
-efficient way of programming.
-Ex: Tower of Hanoi,Tree traversals, DFS,BFS(Graph)

Direct Recursion:
------------------
void abc()
{
	...
	....
	abc();

}

Indirect Recursion:
--------------------
void xyz()
{
	mnp();
}

void mnp()
{
	xyz();
}

