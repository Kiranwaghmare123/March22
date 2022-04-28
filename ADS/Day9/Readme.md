Day 9 :  28/04/2022
Topic : Queue
---------------------------------------------	
-Queue
-Circulr Queue


Queue:
-------
    -linear, ordered collection, homogeneous in nature
    -non-primitive data type
    -using 2 pointer:
      -Rear pointer: Insertion operation: enqueue
      -Front pointer: Deletion operation: dequeue
    -First-In-First-Out(FIFO)
    -Last-In-Last-Out(LILO)
    -total no  of elements present in Queue:
      -No of element=rear-front+1

![image](https://user-images.githubusercontent.com/72081819/165717239-9ea44837-2ad7-47db-8741-93fff514bd8f.png)

Queue Operations:
-----------------
    -Enqueue
    -Dequeue
    -Display
    -isEmpty()
    -isFull()
    -peek()
    -count()

Enqueue()
----------
    1.queue = full
    2.first element=> front=0
    3.Insertion=> rear=rear+1
    4.adding new element=> position is pointed by rear


Dequeue():
-----------
    1.queue = empty
    2.Deletion=> use front pointer
    3.Deletion=> Front=Front+1
    4.Last element=> Front=Rear=-1


Types of Queue:
----------------
    -1. Simple Queue
    -2. Circular Queue
    -3. Priority Queue
    -4. Double Ended Queue (Deque)



Circulr Queue:
---------------
    -It is not linear but circular in nature.
    -uses 2 pointers- Front and Rear
    -Front for Insertion operation
    -Rear fro Deletion operation
    -last element of circular queue is connected to first element of queue.
    
![image](https://user-images.githubusercontent.com/72081819/165717164-45775397-c5aa-4332-a35e-20f85b9329e2.png)

Circular Queue Operations:
---------------------------
    -Enqueue
    -Dequeue
    -Display
    -isEmpty()
    -isFull()
    -peek()
    -count()


Priority Queue:
---------------
    -special type of queue, which assigns some priority to the elements.


Priority Queue Operations:
---------------------------
    -Enqueue
    -Dequeue
    -Display
    -isEmpty()
    -isFull()


Double Ended Queue (Deque):
----------------------------

    1.Input Restricted Deque:
      -Input is restricted at a single end but it allows deletion at both the ends.

    2.Output Restricted Deque:
      -Outpu is restricted at a single end but it allows insertion at both the ends.

![image](https://user-images.githubusercontent.com/72081819/165717094-06066177-309b-48df-b915-863b88305acf.png)

Operations on Deque:
------------------------
    insertfront():adds an element at the front.
    insertlast():adds an element at the rear.

    deletefront():deletes an element from the front.
    deletelast():deletes an element from the rear.	

    getfront()
    getrear()
    isEmpty()
    isFull()
