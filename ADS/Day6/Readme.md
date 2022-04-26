Tree:
-----
    A tree is a non-linear data structure that represent a hierarchical relationship among the various data elements.

    -Trees are used in applications in which the relation between data elements needs to be represented in a hierarchy.
    
![image](https://user-images.githubusercontent.com/72081819/165331444-76df0ebd-8158-4b34-9ea5-d3b3fb474cc7.png)


 
    -Each elemet in a tree is refered as node.
    -Topmost elemnet in a tree is called root.
    -Leaf node:
    -Subtree:
    -Children:
    -Degree of a node:
    -Sibling:
    -Internal node:
    -Level of a node:
    -Depth of a tree:
    -Height of a tree:
![image](https://user-images.githubusercontent.com/72081819/165332397-bd84a4b8-9641-4925-bc6e-ae624d356a00.png)
![image](https://user-images.githubusercontent.com/72081819/165332559-b90dcecd-2352-4ae5-bf41-6144e3162674.png)

Binary Tree:
------------

    - Binary tree is a specific type of tree in which each node can have at most 2 children namely right child and left child.
    (0,1,2)
    
![image](https://user-images.githubusercontent.com/72081819/165331571-f49bc26c-8e5c-43b1-a11b-7d5a7923471a.png)


Types of tree:
---------------

    -Strictly Binary Tree
    -Full Binary Tree
    -Complete Binary Tree
    
 ![image](https://user-images.githubusercontent.com/72081819/165332677-34063ce2-a8d3-44d7-b0ca-ada7cd931631.png)


Full Binary Tree:
------------------

    A binary tree is a full binary tree if every node has 0 to 2 children.

Complete Binary Tree:
----------------------
    A binary tree with n nodes and depth d whose nodes correspond to the nodes numbered from 0 to n-1 in the full binar tree.
    
    
Binary Tree Node structure:
-----------------------------

    Node
    {
      int data;
      Node left, right;
      Node(int d)
      {
        data = d;
        left=right=null;
      }
    }
    
![image](https://user-images.githubusercontent.com/72081819/165333303-ce8cf591-1570-4930-be5a-3edaa245b922.png)

