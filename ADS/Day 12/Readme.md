Day 12 :  02/05/2022
Topic : Graph
---------------------------------------------	

	
    class Graph
    {
      ArrayList<ArrayList<Integer>> graph;
      int v;

        Graph(int nodes)
        {
          v = node;
          graph = new ArrayList<ArrayList<Integer>>();
          for(int i=0;i<v;i++)
          {
            graph.add(new ArrayList<Integer>());
          }
        }
        void addEdge(int v, int u)
        {
          graph.get(v).add(u);
          graph.get(u).add(v);

        }

        void PrintGraph()
        {
          for(int i=0;i<v;i++)
          {
            System.out.println("Node: "+i);
            for(int x : graph.get(i));
              System.out.println("-> "+x);
            System.out.println();
          }
        }

        public static void main(String args[])
        {
          Graph g1 = new Graph();
          g.addEdge(0,1);
          g.addEdge(3,2);
          g.addEdge(2,4);
          g.addEdge(3,1);
          g.addEdge(1,4);
          g.addEdge(2,0);
          g.PrintGraph();

        }
    }	

BFS and DFS Traversal:
------------------------
	
     a: b c
     b: d e
     d: h
     h:	-
     e: i j
     i: -
     j: -
     c: f g
     f: k
     k: -
     g: -

     DFS:a b d h e i j c f k g
     BFS:a b c d e h i j f g k
 
 
Tree Applications:
-------------------

    -Binary Tree: Max no of children is in range 0 to 2

    -Binary Search Tree:LC < Root > RC

Create BST: 40, 20, 50,10, 30, 45, 60

![image](https://user-images.githubusercontent.com/72081819/166264041-081873f6-0ca2-415e-b2ae-09d8342822a2.png)















create: 50, 40, 35, 30, 20,10,5









Balanced Tree:
--------------------
-A search tree data structure for which a 
height of O(log n) is guaranted when implementing
 a dynamic set ofdynamic set of n elements.
 
Tree Application:
-------------------
 
 Ex:
 ----------
 AVL Tree :Rotations
 Red-Black Tree : Rotations + Color code
 BTree : Range of Elements
 B+Tree
 
 Create AVL Tree: 40 ,20, 10,25,30, 22, 50
 
 ![image](https://user-images.githubusercontent.com/72081819/166264235-6992a292-fd8d-4079-9e11-5c8c311e23f0.png)

