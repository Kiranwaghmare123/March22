
Day 4 :  22/04/2022

Topic : 
---------------------------------------------	
![image](https://user-images.githubusercontent.com/72081819/164673808-f5252daa-d34c-4fc9-904c-1dd504b0a1b8.png)

	
	-Linked List
	-Insertion operation
	-Deletion operation
	-Search operation
	
	![image](https://user-images.githubusercontent.com/72081819/164673656-0e93668f-2e0e-43c7-acaf-ab1ed866fda0.png)

	
Insertion operation:
----------------------

  1.Insert at begining.
  2.Insert in between 2 nodes.
  3.Insert at end.

 1.Insert at begining.
 ------------------------
 
  ![image](https://user-images.githubusercontent.com/72081819/164673880-9feb7f66-df0f-4394-896f-16ddd6573bf8.png)

    void insert(int new_data)
    {
      Node new_node = new Node(new_data);
      new_node.next = head;
      head= new_node;


    }

  2.Insert in between 2 nodes.
  -----------------------------
  
  ![image](https://user-images.githubusercontent.com/72081819/164673990-93ad4ef4-dcf8-4562-9662-01db984fcd78.png)

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

![image](https://user-images.githubusercontent.com/72081819/164674503-4194b08e-d440-4d20-9aaf-97b890117838.png)


 3.Insert at end.
 -----------------
 
 ![image](https://user-images.githubusercontent.com/72081819/164674414-46c342cd-6cbe-4ce7-9601-a31c2c8c2e67.png)

 
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

![image](https://user-images.githubusercontent.com/72081819/164674628-92c75720-420a-444a-beb1-927cd6968498.png)
![image](https://user-images.githubusercontent.com/72081819/164674713-2882638c-80b4-4935-9228-7d3945b703d9.png)

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
    
    ![image](https://user-images.githubusercontent.com/72081819/164674811-21657234-88e2-43d4-b456-3f3b45cb2191.png)

Length of Linked List or Count of no of nodes in Linked List:
-----------------------------------------------------------------


	int count()
	{
		Node n=head;
		int count = 0;
		while(n != null)
		{
			count++;
			n=n.next;

		}
		return count;

	}


Count of no of nodes in Linked List:
Recursive method:
------------------------------------


	int revcount(Node n)
	{

	if(n == null)
		return 0;

	return 1+ revcount(n.next)
	}

	//call

	revcount(head);
![image](https://user-images.githubusercontent.com/72081819/164763851-e28635b8-017a-4955-af55-c34cde5d23b6.png)


Search aparticular node in Linked List:
-----------------------------------------


	search(Node head,int x)
	{
		Node n=head;
		while(n != null)
		{
			if(n.data == x)
				return true;
			n=n.next;	
		}
		return false;
	}

	//call

	if(l1.search(head, 3))
		SOP ( "Found!");
	else
		SOP ("Not Found!");

