
===========================================
Day 3 :  21/04/2022
Topic : Recursion
---------------------------------------------	
	-Recursion
	-Linked List



Linked List:
=============
  Array: int a1[1000]
  
Limitation:
  
  -static declaration of array size.
  -contiguous allocations.


Solution:

        -dynamic allocation of memeory.
        -increase/decresase in data size.
        -sequential data structure
        -sequence of links
        -most used data structure

Node:
-----

      -data: value of node
      -link: stores the address of next connection



    class Abc
    {
    Abc a1;//ref variable
    a1 =new Abc();

    }


Node Implementation:
---------------------

    class Node
    {
      int data;
      Node next;
      Node(int d)
      {
        data=d;
        next=null;
      }
    }
