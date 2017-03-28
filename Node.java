import java.util.Random;

/**
 * The Node class is used takes in a Node with a String value(name) from the BST. Based off of that string the Node class can
 * search through the BST for that node and increase the frequency if that name is already in the BST. If the
 * name is lower on the alphabet than the other nodes then it is passed down the left side and added to the BST. 
 * If the name is higher on the alphabet than the other nodes then it is passed down the right side and added
 * to the BST. 
 * 
 * @author (Michael Blackley) 
 * @version (04/21/2015)
 */
public class Node {
   private String name;
   public int frequency;
   private Node left, right;

   public Node (String p) { //pass in String to create new Node and assign all fields their starting values
      frequency = 1;
      name = p;
      left = null;
      right = null;
   }
   
    public Node search (String p){  //pass in String to search for specific node with matching string
      if(p.compareTo(name)==0){     //if the String is equal to the one being searched for then it is returned
         return this;
      }else{
         if(p.compareTo(name)<0){   //if the String is less than the one being searched for it searches 
                                    //farther down the tree
            if(left == null){       //no left child
               return null;            
            }else{
               return left.search (p); //recursively call search on left child
            }
         }else{
            if(right == null){      //there is no right child
               return null;
            }else{
               return right.search (p); //recursively call search on left child
            }
         }
      }
   }

   public void add (Node e){
        if(e.toString().compareTo(name)<0 )  //checks if the name of the node is less than the root
         {
          if(left == null)                   //checks if there is a left child
          {
          left = e;                          //assigns new child to the left if empty   
          }
            else
            {
             left.add(e);                    //if the left is not empty, recursively adds again
            }          
         }
          else if (e.toString().compareTo(name)>0 ) //checks if the name of the node is greater than the root
          {
            if(right == null)                //checks if there is a right child   
            {
               right = e;                    //assigns new child to the right if empty
            }
            else
            {
            right.add(e);                    //if the left is not empty, recursively adds again   
            }         
          }else{
            increaseFrequency();             //if the new node equals another in the tree it increases frequency
          }         
       }

     public int getFrequency()  //method returns frequency
    {
      return frequency;
    }
   
   
    public void increaseFrequency()  //method increases frequency
    {
            frequency++; 
    }

   
   public String getName()          //method returns name
   {
      return name;
   }

   public String toString()         //method returns name
   {
      return name;
   }
   
   public void setLeft(Node e){    //method sets the node to the left
      left = e;
   }
   public void setRight(Node e){   //method sets node to the right
      right = e;
   }
   public Node getLeft () {        //method returns left node 
      return left;
   }
   public Node getRight () {       //method returns right node
      return right;
   }
   
}   


