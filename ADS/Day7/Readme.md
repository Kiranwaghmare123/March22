Day 7 :  26/04/2022
Topic : 
---------------------------------------------	

	-Binary Tree

Tree Traversal:
----------------
		-Preorder: Root, LC, RC
		-Inorder: LC, Root, RC
		-Postorder : LC, RC, Root
![image](https://user-images.githubusercontent.com/72081819/165291980-a3bae2d9-0df3-41f3-97f6-c0c0e072cb61.png)

Inorder :
--------------

    void printInorder(Node n)
    {
      if(n == null)
        return;
      printInorder(n.left);
      System.out.println(n.data+);
      printInorder(n.right);	

    }
    
Preorder :
--------------

    void printPreorder(Node n)
    {
      if(n == null)
        return;
      System.out.println(n.data+);
      printPreorder(n.left);
      printPreorder(n.right);	
    }


Postorder :
--------------

    void printPostorder(Node n)
    {
      if(n == null)
        return;

      printPostorder(n.left);
      printPostorder(n.right);
      System.out.println(n.data+);
    }
    

Binary search Tree:
---------------------

-It is a binary tree in which every node satisfies the following conditions:

	-All values in the left subtree of a node are less than  the value of the node.
  
	-All the values in the right subtree of a node are greater than the value of the node.
	
![image](https://user-images.githubusercontent.com/72081819/165292106-151e43b6-2640-4f51-8250-fccf05f7cb7d.png)
	
		
Insertion:
-------------
	
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
	
	
	
Deletion:
--------------
case 1: leaf node
case 2: one child
case 3: two children


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

    int minvalue(Node root)
    {
      int x = root.data;
      while(root.left != null)
      {
        x = root.left.data;
        root =root.left;
      }
    }
