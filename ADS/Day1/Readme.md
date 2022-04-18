Module 2 : Algorithms and Data Structures
===========================================
Day 1 :  18/04/2022
Topic : Introduction to Data Structures
---------------------------------------------	
	-Problem Solving & Computational Thinking 
	-Algorithms & Data Structures
		-Introductory Concepts
		-Algorithm Constructs
		-O O design: Abstract Data Types (ADTs)
	-Basic Data Structures
		-Arrays
		-Stacks 
		-Queues
		-Circular Queues
	-Arrays


Computational Thinking:
------------------------
-Process solving process.
1.Pattern Recognition
2.Decomposition
3.Abstraction
4.Algorithm Design

Algorithm: 
-step wise procedure to solve the problem.

Characteristics of Algorithm:
-------------------------------
1.Input:some input must be provided.
2.Output:1/ more output must be generated.
3.Unambiguity:it must be simple and clear.
4.Finite:It must have aend limit.
5.Effectiveness:Each step must affects 
	the overall process of execution.


Performance of Algorithm:
--------------------------
1.Space
2.Time

*Performance of Algorithm is directly proportional 
to the input values in terms of space and time.

Classification of Data Structure:
-----------------------------------

![image](https://user-images.githubusercontent.com/72081819/163782325-6f8dbe81-0371-43b5-a7c1-879c1835e417.png)


ADT:Abstract Data Type/Structure:
----------------------------------
![image](https://user-images.githubusercontent.com/72081819/163782382-c5ede281-fa1c-40dc-b462-4acb0b6f7488.png)


Arrays:
-------
finite
homogeneous
ordered

UPPER BOUND
LOWER BOUND

![image](https://user-images.githubusercontent.com/72081819/163782492-d632e48f-a00f-4a63-9ebe-297bcad99faf.png)

Row Major Order:
------------------
A(ij)=M+(i-1)*n+j-1

A(13)=100+(1-1)*3+3-1
	=100+2
	=102

Column Major Order:
---------------------
A(ij)=M+(j-1)*m+i-1

A(32)=100+(2-1)*3+3-1
	=105


Homework:
---------

1.Write down the difference between Linear and Non-linear Data Structure.
2.Prepare short note on ADT.

Programming Questions:
----------------------

1. Write a Java Program for Array data structure with following format.
		![image](https://user-images.githubusercontent.com/72081819/163783514-cdc556a5-ab71-4e26-97c4-433aef59c4bd.png)


2. Write a Java Menu driven Program for Arrays Data structure for following Menu.
		1.Insert
		2.Display
		3.Search
		4.Delete
		5.Exit

3. 	Write a program to reverse an array or string
		Given an array (or string), the task is to reverse the array/string.
		Examples : 
		
		Input  : arr[] = {1, 2, 3}
		Output : arr[] = {3, 2, 1}

		Input :  arr[] = {4, 5, 1, 2}
		Output : arr[] = {2, 1, 5, 4}
		
4. Write a Java Program to find the Common elements 
		Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
		Note: can you take care of the duplicates without using any additional Data Structure?

		Example 1:
		Input:
		n1 = 6; A = {1, 5, 10, 20, 40, 80}
		n2 = 5; B = {6, 7, 20, 80, 100}
		n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120}
		Output: 20 80
	
5. Write a Java program to find Row with max 1s.
		Given a boolean 2D array of n x m dimensions where each row is sorted. Find the 0-based index of the first row that has the maximum number of 1's.

			Example 1:

			Input: 
			N = 4 , M = 4
			Arr[][] = {{0, 1, 1, 1},
								 {0, 0, 1, 1},
								 {1, 1, 1, 1},
								 {0, 0, 0, 0}}
			Output: 2
			Explanation: Row 2 contains 4 1's (0-based indexing).

			Example 2:

			Input: 
			N = 2, M = 2
			Arr[][] = {{0, 0}, {1, 1}}
			Output: 1
			Explanation: Row 1 contains 2 1's (0-based indexing).



