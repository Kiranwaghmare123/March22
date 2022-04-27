
Day 8 :  27/04/2022
Topic : Stack
---------------------------------------------		
	
Stack:
-------
    -ordered & homogeneous data structure
    -Top/Tos
    -TOS:Top of Stack
    -LIFO:Last In First Out

Operations on Stack:
-----------------------
    -Insertion: Push:Insert an element 
    -Deletion: Pop:Remove an element
    -isEmpty():stack is empty or not
    -isFull():stack is full or not
    -peek():return current position of TOS
    -count():count an total number of elements in stack
    -change():change the position of an element
    -display():print the elements of stack

    ex: 1,2,3,47,56,5

Stack Implementation:
----------------------
    1.Array Representation
    2.Linked List Representation

![image](https://user-images.githubusercontent.com/72081819/165470182-f1b946b3-2670-45c0-8258-eb2d5124992e.png)

Array Implementation of stack:
------------------------------
   int s[] = new int [Max];
   int top;


    boolean isEmpty()
    {
      return (top < 0);
    }

    Push operation:
    -------------------
    boolean push(int x)
    {
      if(top >= Max-1){
        System.out.println("Overflow !!!");
        return false;
      }
      else {

        s[++top] = x;
        System.out.println(x+"----> Push operation!!!");
        return true;

      }

    }

Pop Operation:
---------------
    int pop()
    {
      if(top < 0){
      System.out.println("Underflow !!!");
      return 0;
      }
      else{
        int x = s[top--];
        return x;
      }
    }


Stack Applications:
--------------------
    -Balancing of symbols
    -String reversal
    -Recursion
    -Depth first search(DFS)
    -Backtracking
    -Expression conversion
    -Memory Management

	
	
	
-String reversal:
------------------	
![image](https://user-images.githubusercontent.com/72081819/165470353-d83b42d5-9612-40c5-8966-25e3dd44f28f.png)


-Balancing of symbols:
-----------------------
Data Structure:Stack

case 1:

()()()
NO. OF OPENING BRACKETS = NO OF CLOSING BRACKETS ==> Balanced

case 2:

(()())((() : 
	
NO. OF OPENING BRACKETS = NO OF CLOSING BRACKETS ==> UnBalanced	
	

Case 3:
({[]}())))))

Case 4:
)))(}

Steps to be followed:
-----------------------

	1. For each character of input string:
			-if ( => call push operation
			-if ) => call pop operation
			  --Check top of stack, if it s '(', pop and move to next character
	      --If it is not '(', return false.
	2.After scanning of entire string, 
		-check if stack is empty=> return true => "balanced".
		-check if stack is non empty=> return false => "unbalanced".

	
Polish Notations:
-------------------

	1. Infix Notation: a+b
	2. Prefix Notation: +ab
	3. Postfix Notation: ab+
	
![image](https://user-images.githubusercontent.com/72081819/165514385-e93a368d-faeb-440d-a7bd-9df5b3e108a0.png)


Ex:1:
------
Conversion of Infix to postfix:
------------------------------------
	A+(B/C)-D
	A+(BC/)-D
	A(BC/)+)-D
        A(BC/)+)D-


Conversion of Infix to prefix:
------------------------------------
	A+(B/C)-D
	A+(/BC)-D
	+A(/BC)-D
	-(+A(/BC))D
	

Ex:2
------
(A+B)/(c-D)	
	
	Prefix:		/+AB-CD
	Postfix:	AB+CD-/

	
Ex:3
-----	
A+B/c-D
	
	
	Prefix:		-+A/BCD
	Postfix:	ABC/+D-


Convert Infix to Postfix Notation using Stack:
-----------------------------------------------
	Ex:1
	A + ( B * C )

![image](https://user-images.githubusercontent.com/72081819/165514546-57dd2301-2051-447e-bd3a-2ef1e2c83780.png)

	Ex:2	
	( A + ( B * C ) / ( D - E ) )

	EX:3
	 (A+(B*C-(D/E)*G)*H)


Convert Infix to Prefix Notation using Stack:
-----------------------------------------------
	A + ( B * C )
	a+B*c
	c*B+a--->ans in Postfix---< reverse



Postfix Evalaution:
--------------------
	Ex:1
	3 10 5 + *

![image](https://user-images.githubusercontent.com/72081819/165514664-5acdff17-90da-4421-b4d1-26b4bc846248.png)

	Ex:2
	7 4 -3 * 1 5 + / *

	HW:
	----
	Ex:
	5 3 2 * 8 + *	

	
	
Homework Problem:
------------------

	1. Design a Menu driven program for Stack implementation using Array.

	2. Given an expression string exp, write a program to examine whether the pairs and the orders of “{“, “}”, “(“, “)”, “[“, “]” are correct in exp.
	Example: 
		Input: exp = “[(])” 
		Output: Not Balanced 

		Input: exp = “[()]{}{[()()]()}” 
		Output: Balanced

	
