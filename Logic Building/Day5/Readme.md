Day 5: 12-03-2022
======================
Topics:
	-Access Modifiers
  
	-Arrays
  
	-Strings

Access Specifier/Modifiers:
----------------------------

-used to set accessibility

-retricts access of datamembers, methods

-class, block, variables,methods


Access modifiers:
------------------
	-default:
		-VISIBILITY TO THE PACKAGE
    
	-Public:
		-VISIBILITY TO THE WORLD
    
	-Private:
		-VISIBILITY TO ONLY CLASS
    
	-Protected:
		-VISIBILITY TO THE PACKAGE AND SUBCLASSESS

Non-Access Modifiers:
----------------------
	-static
  
	-final
  
	-abstract
  
	-synchronised & volatile
	

Array:
--------
-array is an indexed collection of similar data elements thant has fixed size.

-Array is an object

-1. Declaration of array
-2. Creation of array

e.g.: int a1[] = new int[5];//allocate memory

size of array= int(4 bytes) * size (5)= 20 bytes

Array Declare:
----------------

	1.new operator
	-e.gint a1[] = new int[5];
	
	2.array initializer
	-int []a1 ={1, 3, 5, 7, 9};
	-int a1[] ={1, 3, 5, 7, 9};
	
	
	
	
	
	Examples:
	---------------
	int a1[];
	int []a1;
	int a1[],b,c;
	int a1[],b[],c[];
	a1 [] a,b,c;
	a1 = new int[5];
	
	-collection of similar data types
  
	-contains homogeneous data
  
	-satic array : know the size of array: (fixed)
  
	-dynamic array: don't know the size of array:
  
	-it always start with index 0 and end with n-1.
  
	-allows to store primitive data types values and reference values.


Types of array:
----------------
	1.Single dimensional
		e.g., int a1[] = new int[5];
    
	2.Multi dimensional :2D, 3D ,....
		e.g., int a1[][] = new int[3][];
			size of array= int(4 bytes) * size (9)= 36 bytes
			


For Loop
while  Loop
do-while Loop
-------------------
For each Loop: Array elements printing

for (data type varible : a1)
{
	//block
}

e.g

for(int x : a1)
{
	SOP();
}

Matrix programs:

1.Addition of 2 matrix

2.Substraction of 2 matrix

3.Multiplication of 2 matrix

4. Transpose of a matrix
5. 
6.Sum of all elements of matrix

7.print diagonal element of the matrix


String:
-------------
-String: sequence of characters/character array

-object of type String class

-String is immutable (once it is created , it cannot be changed)
	-security
  
	-synchronization
  
	-caching
  
-Different ways of declaring a string
e.g:

char ch[] ={'S','a','u','r','a','b','h'};

String str = new String("Rohit");

String str1 = "cdac mumbai"

Ways to create a string:

1.String literal
	eg: String str1 = "cdac mumbai"
	
2.using new keyword
	String str = new String("Rohit");
	
	String s1 = "Hello";
	String s2 = "India";
	
String constant pool: 
-String objects are stored in a special memory area 
-Heap memory 
-memory efficient propramming
	-Use less memory
	
	String str = "Hello";
	String s1 = "India"


	String str = "Hello";
	String s1 = new String("India");

String operations:
----------------------

length() 

substring()

compareTo()

isEmpty()

toLowerCase()

toUppercase()

valueOf(): primitive data type---> String

replace(): old character replace by new character

contain()

charAt()

equals():compares 2 strings on the basis of content of the string

reverse()
....
