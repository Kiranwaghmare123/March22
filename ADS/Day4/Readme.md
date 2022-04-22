===========================================
Day 4 :  22/04/2022
Topic : 
---------------------------------------------	
	
	-Linked List
	-Insertion operation
	-Deletion operation
	-Search operation
	
Insertion operation:
----------------------

  1.Insert at begining.
  2.Insert in between 2 nodes.
  3.Insert at end.

 1.Insert at begining.
 ------------------------
 
  
    void insert(int new_data)
    {
      Node new_node = new Node(new_data);
      new_node.next = head;
      head= new_node;


    }

  2.Insert in between 2 nodes.
  -----------------------------
  
  
    void insertAfter(Node prev,int new_data)
    {
      if(prev == null)
      {
        System.out.println("Insertion is not possible.");
        return;
      }
      Node new_node = new Node(new_data);
      new_node.next = prev.next;
      prev.next = new_node;

    }

 3.Insert at end.
 -----------------
 
 
    void append(int new_data)
    {
      Node new_node = new Node(new_data);
      if(head == null)
      {
        head=new_node(new_data);
        return;
      }
      new_node.next = null;
      Node n = head;
      while(n.next != null)
      {
        n = n.next;
      }
      n.next = new_node;
      return;

    }

Delete operation.
---------------------


    void delete(int key)
    {
      Node temp = head, prev =null
      if(temp.data == key && temp !=null)
      {
        head = temp.next;
        return;
      }
      while(temp !=null && temp.data != key)
      {
        prev = temp;
        temp = temp.next;
      }
      if(temp==null)
        {return;}
      prev.next = temp.next;
    }
