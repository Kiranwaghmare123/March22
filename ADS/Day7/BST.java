
class BST
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
	BST(int d)
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
	System.out.println(n.data);//11 22 44 55 33 66
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

Node insertdata(Node root, int key)
{
		if(root == null)
		{
			root = new Node(key);
			return root;
		}
		if(key <= root.data)
			root.left = insertdata(root.left,key);
		else
			root.right = insertdata(root.right,key);
			return root;
}

void insert(int key)
{
	root = insertdata(root, key);
}
//recursive function	
Node deletedata(Node root, int key)
{
	if(root == null)
		return root;
	if(key < root.data)
		root.left= deletedata(root.left, key);
	else if(key > root.data)
		root.right= deletedata(root.right, key);
	else
	{
	//case 1, 2
	if(root.left == null)
		return root.right;
	else if(root.right == null)
		return root.left;
		
	//case 3
	
	root.data = minvalue(root.right);
	//call inorder method and replace with succesor node.
	root.right = deletedata(root.right, root.data);
	}
	return root;	
}
//replacement of node in case of 2 children.
int minvalue(Node root)
{
	int x = root.data;
	while(root.left != null)
	{
		x = root.left.data;
		root =root.left;
	}
	return x;
}

void delete(int key)
{
	root = deletedata(root, key);
}
	
public static void main(String args[])
{	
	BST b1 = new BST(33);
	b1.insert(3);
	b1.insert(43);
	b1.insert(23);
	b1.insert(13);
	b1.insert(73);
	b1.insert(28);
	b1.insert(24);
	b1.insert(30);
	
	
	//System.out.println("Preorder:");
	//b1.preorder();
	
	System.out.println("Inorder:");
	b1.inorder();
	b1.delete(15);
	
	//b1.delete(23);
	//b1.delete(33);
	System.out.println();
	System.out.println("Inorder:");
	b1.inorder();
	
	//System.out.println("Postorder:");
	//b1.postorder();
}

}