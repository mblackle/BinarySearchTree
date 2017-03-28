
/**
 * The BinarySearchTree class takes in a String from the driver class and puts that String inside a Node which is then
 * passed off to the Node class. The BST is also capable of printing the BST in order, pre order and post order. This
 * class also has a search method that takes in a String from the treeDemo class and then passes that String to the 
 * Node class and returns null if that String is not found and if it is it prints that it was found and the frequency 
 * of that name.
 * 
 * @author (Michael Blackley) 
 * @version (04/21/2015)
 */
public class BinarySearchTree {

   private Node root;  
   public static int frequency;
   private int size;
   public String name;
   
   public BinarySearchTree () {
      root = null;            //assign Node and fields their values
      size = 0;
   }
   
   public BinarySearchTree(String e, int f)
   {
      frequency = f;        //assign fields their initial values
      name = e;
   }

 
   public void insert (String e)  //method takes in a String
   {
   Node newNode = new Node(e);    //creates new node with the new String inside
     if(root == null)             //checks if the root is empty  
     {    
      root = newNode;             //if root is empty the new Node is assigned root
     }                        
      else
      {
      root.add(newNode);          //if the root is not empty recursively send new Node to Node class
                                  //which passes it to the root.add() method to create new Node
      }
      size ++;                    //increase size of the Binary Search Tree
   }

   public String getName()        //method returns the name
   {
    return name;
   }
   
   public void printPreOrder()    //method sends root to printPreOrderR() to print BST in PreOrder
   {
   System.out.println("Printing PreOrder");
   if(root!=null)   //checks if the root is not empty
   {    
      printPreOrderR(root);  //sends root to printPreOrderR()
   }
   }
   
   public void printPreOrderR(Node n){  //method prints BST in PreOrder
      if(n!=null){                      //checks whats being passed is not null
      System.out.println(n.getName());  //prints the root first
      printPreOrderR(n.getLeft());      //prints the left child second
      printPreOrderR(n.getRight());     //prints the right child last
                 }
   }
   
      public void printInOrder()        //method sends root to printInOrderR() to print BST in order
   {
   System.out.println("---------------------------------------- ");
   System.out.println("Print InOrder");
      if(root!=null)    //checks if the root is not empty
      {
      printInOrderR(root);  //sends root to the printInOrderR() method
      }
   }
     
      public void printInOrderR(Node n){  //method prints BST in order
      if(n!=null){
     
      printInOrderR(n.getLeft());         //prints the left child first
      System.out.println(n.getName());    //prints the root second 
      printInOrderR(n.getRight());        //prints the right child third  
   }

   }
   
      public void printPostOrder()  //method sends root to printPostOrderR() to print BST in PostOrder
   {
      System.out.println("---------------------------------------- ");
      System.out.println("Print PostOrder");
      if(root!=null)
      {
      printPostOrderR(root);   //sends root to the printPostOrderR() method
      }
   }
   
   
      public void printPostOrderR(Node n)  //method prints BST in PostOrder
  {
      if(n!=null)       //checks the node being passed is not empty
      {
      printPostOrderR(n.getLeft());     //prints the left child first
      printPostOrderR(n.getRight());    //prints the right child second
      System.out.println(n.getName());  //prints the root third
      }

   }
   
   public Node search (String p){     //method searches for the string being passed in
      
      if(root == null)  return null;     //if the root is empty it returns null
      
      Node n = root.search (p);          //assigns Node n to what is being returned by the Node class search method   
      if(n==null){                      
       System.out.println("Node not found: " + p);
      }
      else
      {
        System.out.println("Node is found: " + p);
        System.out.println(n.getName() + " | " + n.getFrequency()); //if node is found it prints the name and 
                                                                   //the frequency of that name in the BST
      }

      return n;
      
   }
   
   public int getSize()  //method keeps track of the size of the BST
   {
   return size;
   }


}
