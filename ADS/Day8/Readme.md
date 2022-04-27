
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

	
	
	
	
	
	
	
	
