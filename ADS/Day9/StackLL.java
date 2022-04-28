
import static java.lang.System.exit;

	class StackLL {

		// A linked list node
		private class Node {

			int data; 
			Node link; 
		}
		
		Node top;
		
		StackLL()
		{
			this.top = null;
		}

		
		public void push(int x) 
		{
			
			Node temp = new Node();

			
			if (temp == null) {
				System.out.print("\nHeap Overflow");
				return;
			}


			temp.data = x;

	
			temp.link = top;

			top = temp;
		}

	
		public boolean isEmpty()
		{
			return top == null;
		}

	
		public int peek()
		{
			
			if (!isEmpty()) {
				return top.data;
			}
			else {
				System.out.println("Stack is empty");
				return -1;
			}
		}

	
		public void pop() 
		{
		
			if (top == null) {
				System.out.print("\nStack Underflow");
				return;
			}

			top = (top).link;
		}

		public void display()
		{
			
			if (top == null) {
				System.out.printf("\nStack Underflow");
				exit(1);
			}
			else {
				Node temp = top;
				while (temp != null) {

		
					System.out.printf("%d->", temp.data);

				
					temp = temp.link;
				}
			}
		}
	


		public static void main(String[] args)
		{
		
			StackLL s1 = new StackLL();
			
			s1.push(11);
			s1.push(22);
			s1.push(33);
			s1.push(44);

		
			s1.display();

	
			System.out.printf("\nTop element is %d\n", s1.peek());

		
			s1.pop();
			s1.pop();

		
			s1.display();

			
			System.out.printf("\nTop element is %d\n", s1.peek());
		}
	


}
