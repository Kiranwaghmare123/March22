Day 10 :  29/04/2022
Topic : Complexity of Algorithm
---------------------------------------------	
Analysis of Algorithm:
----------------------
    -Time Complexity
    -Space Complexity

    -Cost Estimation

Algorithm:
-----------
    -Design
    -Domain Knowledge
    -Any Language 
    -H/w & S/w
    -Analyze



Program:
---------
    -Implementation
    -Programmer
    -Programming Language
    -H/w & S/w
    -Testing

Characteristics of Algorithm:
-------------------------------
    -Input:0/more
    -Output:atleast 1 o/p
    -Definiteness: finite
    -Simple, consize
    -Effective


Ex: Swapping of 2 values:
--------------------------

    swap(a,b)
    {
      temp = a;
      a = b;
      b = temp;
    }


Ex: Sum of Array elements:
------------------------------
    sum(A,p)
    {
      s=0;
      for(i=0;i<n ;i++){

        s=s+A[i];
      }
      return s;
    }

Ex: Addition of Matrix:nXn
--------------------------
    add(A,B,n)
    {
      for(i=0;i<n;i++)
      {
      for(j=0;j<n;j++)
      {
        C[i,j]=A[i,j]+B[i,j];
      }
      }
    }

Order of Complexity:
---------------------

    1 < log n <sqrt(n) <n < nlogn <n^2 <n^3 <...< 2^n <3^n <...< n^n

Types of Complexity:
--------------------
    O(1): Conatant
    O(log n) : Logarithmic
    O(n): Linear
    O(n^2):Quadratic
    O(n^3): Cubic
    O(2^n):Exponential
    O(3^n):
    O(n^n):
![image](https://user-images.githubusercontent.com/72081819/165921824-1ad76bda-e3a4-45d1-9085-50c5ff0bcc17.png)

Sorting Algorithms:
--------------------
    Sorting:
    -arranging the set of elments in asending or desending order.
    -Arangement of elements will decide the type of Sorting algorithms.

Types of Sorting Techniques:
----------------------------
    -Internal Sorting:
      -data is to be sorted within allocated memeory.
    -External Sorting:
      -data is to be sorted within memeory in addition to auxillary memory.


Internal Sorting:
------------------
    Given array : 2 5 8 9 4 7 2 
    Sorted array :2 2 4 5 7 8 9 

    Given array : 2 5 8 9 4 7 2 
    Sorted array :2 2 4 5 7 8 9 

![image](https://user-images.githubusercontent.com/72081819/165921874-8e373108-8b7c-49b3-a678-2cadeaf11fa9.png)


Stable sorting:
----------------
    - after sorting the contents, if elements does not change the sequence of similar content, then it is a stable sorting.

Unstable sorting:
-----------------
    -after sorting the contents, if elements change the sequence of similar content, where they appear then it is a unstable sorting.

Efficiency of Algorithm : 
--------------------------
    -Running time complexity of time and space.
    -best-case, average-case and worst-case.
    
Bubble Sort:
-------------------------------
    Pass 1

      5 	3 	8 	4   6

      3   5	  8	  4   6

      3   5   8   4   6

      3   5   4   8   6

      3   5   4   6   8
    -------------------------------
     Pass 2

      3   5   4   6   8

      3   5   4   6   8

      3   4   5   6   8

      3   4   5   6   8

      3   4   5   6   8
    -------------------------------

    void bubbleSort(int a1[])
    {
      int n = a1.length();
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
SELECTION SORT:
------------------
    min = 2
        7  5  4  2

        1 |  5  4  7

        2  4 |   5 7

        2  4  5 |  7

	
    void selectionsort(int a1[])
    {
        int n = a1.length;
        for(int i=0;i<n-1;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if(a1[j] < a1[min])
                    min = j;

                //swapping
                    int temp = a1[min];
                    a1[min] = a1[i];
                    a1[i]=temp;
            }
        }

    }

INSERTION SORT:
---------------
	|| 4  3  2  10  12  1
	
	4 ||  3  2  10  12  1
	
	3  4 ||  2  10  12  1
	
	2  3  4  || 10  12  1

	2  3  4  10 ||  12  1
	
	2  3  4  10 12  ||  1
	
	1  2  3  4  10  12  ||
	
    void insertionsort(int a1[])	
    {
        int n = a1.length;
        for(int i=1;i<n;i++)
        {
            int k = a1[i];
            int j = i-1;

            while(j>=0 && a[j]>k)
            {
                a1[j+1]=a1[j];
                j=j-1;

            }
            a1[j+1]=k;
        }
    }


    //Best case
    |1 2 3 4 5
    1| 2 3 4 5
    1 2 | 3 4 5
    1 2 3 | 4 5 
    1 2 3 4 | 5
    1 2 3 4 5 |




Divide and Conquer Algorithm:
------------------------------
-i/p size --->large  then lot of time execute 
-purpose: tohandle the worst case running algorithms ---> O(n^2)
-Ex: Merge Sort, Quick Sort


![image](https://user-images.githubusercontent.com/72081819/165969316-f36e7be5-613b-4d9e-9a32-c2b30cedba3d.png)

![image](https://user-images.githubusercontent.com/72081819/165969631-d06685d2-b14c-4955-a417-082404bfa734.png)
