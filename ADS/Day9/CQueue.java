class CQueue
{
	int max=7;//size of circular queue
	int CQ[] = new  int[max];
	int front, rear;
	
	CQueue()
	{
		front=-1;
		rear=-1;
	}
	
	boolean isFull()
	{
		//case 1
		if(front==0 && rear == max-1)
		{	return true;}
	//case 2
		if(front == rear+1)
		{	return true;}
		
		return false;
	}
	
	boolean isEmpty()
	{
		if(front == -1)
		{	return true;}
		return false;
	}
	
	
	void enqueue(int element)
	{
			if(isFull())
				System.out.println("Queue is Full !!!");
			else
			{
				//Checking for first queue element
				if(front == -1)
				{
					front = 0;
				}
				rear=(rear+1)%max;
				CQ[rear]=element;
				System.out.println(element +" Insertion done !!!");
				
			}
				
	}
	
	
	int dequeue()
	{
		int element;
		if(isEmpty())
		{
			System.out.println("Queue is Empty !!!");
			return  -1;
		}
		else
		{
			element = CQ[front];
			//remaining one element in queue
			if(front == rear)
			{
				front=-1;
				rear=-1;
			}
			else
			{
				front=(front+1)%max;
			}
			System.out.println("Deleted element = "+ element);
			return element;
					
			
		}
	}
	
	
	void display()
	{
		for(int i=front;i<= rear;i=(i+1)%max)
		{
			System.out.print(CQ[i]+" ");
		}
		
		System.out.println(rear+" => Rear pointer");
		System.out.println(front+" => Front pointer");
		
	}
	
	
		public static void main(String args[])
	{
		
		CQueue q = new CQueue();
		//q.dequeue();
		//q.display();
		
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.enqueue(60);
		q.display();
		
		System.out.println(" ");
		q.dequeue();
		q.display();
		
		
	}
}