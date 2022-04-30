Merge Sort:
-------------	
    -Divide & Conquer
    -Recursion
 Algorithm:
 ----------
     mergesort(l,h)
     {
      if(l<h)
      {
        mid=l+h/2;
        mergesort(l,mid);
        mergesort(mid+1,h);
        merge(l,mid,h);

      }
     }
     merge(int a1[], l, m, r)
     {
     int n1 = m-l+1;
     int n2 = r-m;

     int L[] = new int[n1];
     int R[] = new int[n2];

     for(int i=0;i<n1;i++)
      L[i]=a1[l+1];
     for(int j=0;j<n2;j++)
      R[j]=a1[m+1+j];

      int i=0,j=0
      int k=l;
      while(i<n1 && j<n2)
      {
        if(L[i] <= R[j])
        {
          a1[k] = L[i];
          i++;

        }
        else
        {
          a1[k] = R[j];
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

 Merge:
 ------------
 
     A: 2 6 9 15 20 24 27

     B: 5 9 14 17 31 35 65 78  89 92

     C:	2 5 6 9  9 14 15 17 20 24 27 31 35 65 78  89 92
     
     
 
 Quick sort:
 -----------
 
     80 90 30 50 70 10

     10 205 305 401 50
![image](https://user-images.githubusercontent.com/72081819/166105392-531dd0a3-007a-441f-8a43-e32dfd8b385b.png)

 
Example: 
      10 16 8 12 15 6 3 9  5  #


      10 5 8 12 15 6 3 9 16 #

      10 5 8  9 15 6 3 12 16 #

      10 5 8 9 3 6 15  12 16  #

      6  5  8  9 3 10  15 12 16
  
 

 Quick Sort:
 ---------------
     void  Quicksort(int a1[],int low, int high)
     {
      if(low < high)
      {
        int pi = partition(a1,low,high);
        Quicksort(a1,low,pi-1);
        Quicksort(a1,pi+1,high);

      }
     }

 
  
      int partition(int a1[],int low, int high)
      {
      int pivot = a1[high]
      int i =(low-1);
      for(int j = low; j < = high-1;j++)
      {
        if(a1[j] < pivot)
        {
          i++;
          swap(a1,i, j);
        }
      }
      swap(a1,i+1, j);
      return (i+1);

      }
  
      static void swap(int[] a1, int i, int j)
      {
        int temp = a1[i];
        a1[i] = a1[j];
        a1[j] = temp;
      }
	
Heap:
-----

    -Data structure : Heap
    -special form of complete binary tree  

Types of Heap:
---------------
1. Max-Heap
2. Min-Heap


Q. Create a heap with following elements:
14 12 7 10 8 2

Max-Heap:
Insertion operation:
Deletion :Root node
--------------------

![image](https://user-images.githubusercontent.com/72081819/166105305-bdd5b82a-90fe-422d-b7b6-e7163a38d5df.png)


Min-Heap:
Insertion operation:
Delete operation :Root node
--------------------


Heap Sorting:
-------------
  
  
      void heapsort(int a1[])
      {
      int n = a1.length;

      for(int i=n/2-1;i>=0;i--)
        heapify(a1,n,i);

      for(int i=n-1;i>0;i--)
      {
        int temp=a1[0];
        a1[0] = a1[i];
        a1[i] = temp;

        heapify(a1,i,0);
      }



      }
      heapify( int a1[],int n, int i)
      {
      int largest = i;
      int l = 2*i;
      int r = 2*i+1;

      if(l < n && a1[l]> a1[largest] )
        largest = l;

      if(r < n && a1[r]> a1[largest] )
        largest = r;

      if(largest != i)
      {
        int temp = a1[i];
        a1[i]=a1[largest];
        a1[largest]=temp;

        heapify(a1,n,largest);
      }


      }
 
Hashing:
---------
    -fastest Searching techniques.
    -A techique tha tdetermines an index(location) of that data.
    -hash function:receive search key
      -return us an address of that location.
      -hash tables.
	
![image](https://user-images.githubusercontent.com/72081819/166105285-3f43d733-b93d-45a2-aab2-5a50f9964803.png)


Types of Hashing:
---------------------
    1. Open Hashing
      -Chaining ---> Linked list
    2. Closed Hashing
      -Open Addressing:
        -Linear probing
        -Quadratic probing
        -Double Hashing

Hash function:

    h(x)= x % 10
    h(8)= 8%10 = 8

	
