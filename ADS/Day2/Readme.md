Day 2 :  20/04/2022
Topic : Arrays
---------------------------------------------	
	-Array
	-Searching Techniques
	-Recursion
	
Searching:
-----------
1. Linear search

2. Binary search


Recursion:
-----------
	-Function which calls itself directly or indirectly is called Recursion.
	
	-solves the problem by calling a copy of iteself to work on a smaller problem.
	
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

Programming Questions:
-----------------------

1. Problem: Given an array arr[] of n elements, write a function to search a given element x in arr[].

		Examples :  

		Input : arr[] = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170}
			  x = 110;
		Output : 6
		Element x is present at index 6

		Input : arr[] = {10, 20, 80, 30, 60, 50, 
				     110, 100, 130, 170}
			   x = 175;
		Output : -1
		Element x is not present in arr[].
	


2. You are given a list of n-1 integers and these integers are in the range of 1 to n. There are no duplicates in the list. One of the integers is missing in the list. Write an efficient code to find the missing integer.
		Example: 


		Input: arr[] = {1, 2, 4, 6, 3, 7, 8}
		Output: 5
		Explanation: The missing number from 1 to 8 is 5


		Input: arr[] = {1, 2, 3, 5}
		Output: 4
		Explanation: The missing number from 1 to 5 is 4


3. Search an element in a sorted and rotated array.

		Example: 

		Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
			 key = 3
		Output : Found at index 8

		Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
			 key = 30
		Output : Not found

		Input : arr[] = {30, 40, 50, 10, 20}
			key = 10   
		Output : Found at index 3

	
	
4. Move all negative numbers to beginning and positive to end with constant extra space. An array contains both positive and negative numbers in random order.    Rearrange the array elements so that all negative numbers appear before all positive numbers.
		Examples : 

		Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
		Output: -12 -13 -5 -7 -3 -6 11 6 5
		
		

5. Recursive program to print formula for GCD of n integers. 
		Given a function gcd(a, b) to find GCD (Greatest Common Divisor) of two number. It is also known that GCD of three elements can be found by 		    gcd(a, gcd(b, c)), similarly for four element it can find the GCD by gcd(a, gcd(b, gcd(c, d))). Given a positive integer n. The task is to 			print the formula to find the GCD of n integer using given gcd() function.
		Examples: 


		Input : n = 3
		Output : gcd(int, gcd(int, int))

		Input : n = 5
		Output : gcd(int, gcd(int, gcd(int, gcd(int, int))))







