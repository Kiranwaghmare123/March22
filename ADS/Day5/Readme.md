Day 5 :  23/04/2022
Topic : Doubly Linked List
---------------------------------------------	
	
Node structure:
-----------------

    class Node
    {
      int data;
      Node next;
      Node prev;

      Node(int d)
      {
        data = d;
        next = null;
        prev = null;
      }
    }



Display DLL:
-------------


    void display(Node n)
    {
      Node n=head;
      Node p =null;
      System.out.println("Forward Display:");
      while( n != null)
      {
        System.out.println(n.data);
        p=n;
        n=n.next;
      }
      System.out.println("----------------");
      System.out.println("Reverse Display:");
      while( p != null)
      {
        System.out.println(p.data);
        p=p.prev;
      }
    }

![image](https://user-images.githubusercontent.com/72081819/164894662-4f8b09b6-6e67-4b66-90b3-55733fce580c.png)


Alternate way:
----------------

    System.out.println("----------------");
      System.out.println("Reverse Display:");
      while(p.next != null)
      {
        p=p.next;
      }
      while( p != null)
      {
        System.out.println(p.data);
        p=p.prev;
      }


Insertion operation:
--------------------------

    case 1:

    void insert(int new_data)
    {
      Node new_node = new Node(new_data)
      new_node.next = head;
      new_node.prev=null;
      if(head != null )
        head.prev = new_node;
      head = new_node;

    }


    case 2:

    void insertAfter(Node prev,int new_data)
    {
      if(prev = null)
        {return;}
      Node new_node = new Node(new_data);
      new_node.next = prev.next;
      prev.next = new_node;
      new_node.prev = prev;
      new_node.next.prev = new_node;

    }
    
    ![image](https://user-images.githubusercontent.com/72081819/164894688-4a6c934d-0927-475f-85af-16b9fbc7a852.png)

    case 3:

    void append(int new_data)
    {
      Node new_node = new Node(new_data);
      Node n = head;
      new_node.next = null;
      if(head == null)
      {
        new_node.prev = null;
        head = new_node;
        return;

      }
      while(n.next != null)
      {
        n=n.next;
      }
      n.next = new_node;
      new_node.prev = n;

    }

![image](https://user-images.githubusercontent.com/72081819/164894715-f0518800-683b-428c-b1c6-a4d4802b5581.png)
