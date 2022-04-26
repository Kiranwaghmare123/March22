
class BT
{	
	Node root;
	
	static class Node
	{
		int data;
		Node left;
		Node right;
		
		Node(int d)
		{
			data = d;
			left = null;
			right = null;
		}
	}
	BT(int d)
	{
		root = new Node(d);
	}
	
void printInorder(Node n)//Lc,Root, RC
{
	if(n == null)
		return;
	printInorder(n.left);
	System.out.println(n.data);
	printInorder(n.right);	
	

}

void printPreorder(Node n)//Root, LC, RC
{
	if(n == null)
		return;
	System.out.println(n.data);
	printPreorder(n.left);
	printPreorder(n.right);	
}
	
void printPostorder(Node n)//LC,RC,Root
{
	if(n == null)
		return;
	
	printPostorder(n.left);
	printPostorder(n.right);
	System.out.println(n.data);
}

void preorder()
{
	printPreorder(root);
	
}	

void inorder()
{
	printInorder(root);
	
}

void postorder()
{
	printPostorder(root);
	
}
public static void main(String args[])
{	
	BT b1 = new BT(11);
	//b1.root = new Node(11);
	b1.root.left = new Node(22);
	b1.root.right = new Node(33);
	b1.root.left.left = new Node(44);
	b1.root.left.right = new Node(55);
	b1.root.right.right = new Node(66);
	
	System.out.println("Preorder:");
	b1.preorder();
	
	System.out.println("Inorder:");
	b1.inorder();
	
	System.out.println("Postorder:");
	b1.postorder();
}

}