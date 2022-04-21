class LinkedList1
{	
	Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	
	
	
public static void main(String args[])
{	
	LinkedList l1 = new LinkedList();
	l1.head = new Node(10);
	Node second = new Node(20);
	Node third = new Node(30);
	
	l1.head.next = second;
	second.next = third;
	
}

}