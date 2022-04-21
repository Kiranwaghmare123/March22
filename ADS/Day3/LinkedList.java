class LinkedList
{
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
	
	void display()
	{
		Node n=head;
		while(n != null)
		{
			System.out.println(n.data);
			n=n.next;
		}
		
			
	}
}
	
