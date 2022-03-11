Day 4: 11-03-2022
======================
Topics:
	-Constructors
	-Access Specifiers
	-Arrays

Constructors:
--------------
-Constructors are used in the creation of an object.

-It is a block of code used to initialize an object.

-It must have the same name as class name.

-It executes whaen object of a class is being created.

-Types of Constructor:
-----------------------
	-1. Default constructors
		-created by the compiler without having any parameters.
    
	-2. Parameterized constructors
		-constructors which has a specific number of parameters,called as Parametrized Constructor.


Example:
class Student
{
	Student()//Constructor
	{
	
	}
}

Constructor Overloading:
--------------------------

class CDAC
{
	CDAC()//default Constructor
	{ this.id =id;
	
	}
	CDAC(int rollno, String name)//parameterized constructor
	{
	
	}
	CDAC( String name,int rollno,)
	{
	
	}
	CDAC( String name, int prn,String branch)
	{
	
	}
	
	public static void main(String args[])
	{
		CDAC c1 = new CDAC();//object create--> invoke default
		CDAC c2 = new CDAC("Bhavesh",33);----> 2nd constructor
		CDAC c3 = new CDAC(2124035067,"Ankit","Juhu");----> 2nd const
	}
}
	
'this' keyword:
------------------

-referencec variable to the instace variable for current object.

-used to invoke current class method/constructor

-it can be passed as an argument in the constructor call/methods call



	
class MEssage
{
	MEssage()
	{
		this("Arvind");
		System.out.print("Hi Arvind !!!");
	}
	
	ps v main()
	{
	MEssage m = new MEssage();
	}
}


Que: DietPlan
----------------

variables: gender,nutrients,age,weight

functions: setdat(), getdat(),bmi()

constructors: default(), Dietplan(gender, nutri): constructor chaining


Array:
--------

-array is an indexed collection of similar data elements thant has fixed size.

-Array is an object

-1. Declaration of array
-2. Creation of array

e.g.: int a1[] = new int[5];

