
Day 3: 10-03-2022
======================
Topics:
	-class & Object
	-Types of variabls
	-Member functions
	-Method overloading
	-Constructors
	-Static variables & methods
	
Class:
	datamembers/attributes/variables  : common behaviour (state)
	member functions/methods/functions : functionality (behaviour)
	
HW: WAP Book class, add attribute and functionality 
to print the title author, noofpages, publication and year.

Variable:
---------
Variable: "vari"+ "able"

Types of variable:
-------------------
1.Local variables
	methods,constructor,block
	e.g.,:
	
	float calculate(int price)
	{
		float dis;//local variable
		dis=price*(10/100);
		return dis;
	}
	
	
2.Instance variable
eg:

class student
{	
	//object variable/property/field
	int rollno;//s1.rollno = 200
	String name;
	String mobile;	
	
	
	student s1 = new student();
	Student s2 = new student();
}


3.static variable
-static variables are initialized only once.

-static means to "remain constant"

-it is constant for all the instances(objects)

-declaring constant + final 

-static variable = instance variable

-static means constant

class student
{
int Rollno;
String name;
static String batchid="2022";
}


Methods:
--------
-methods are nothing but functions

-describe behaviour of an object

e.g:
void display()
{
	System.out.println(id);
}

Static method:
----------------
-static keyword with method, is known as static method.

-static method belong to class rather than object of a class.

-static method can be invoked without an object.

-(instance of a class: why object is not required.)


-Restrictions for static method:
-------------------------------------
-1.static method can not use non-static variables.

-2.this and super cannot be used in static methods.

Homework:
------------
Ques: WAP to print static and non static variables in static 
and nonstaic methods

a: instance variable, 
id: static variable
------------------------
display():non static
shw():static
