/**
 * This Class defines the info in each Node as well as the operations to the list and Node
 **/

public class Node
{
  // initializes the names that will be included in lists
  String name;
 // intializes the next node
  Node next;
 
 
 
 //Consturctor to input a new name 
 public Node(String name, Node n)
 {
   next = n;
   this.name = name;
   
 }
 /**
  * Constructor to just input the string
  */ 
 Node(String n)
 {
   this(n, null);
 }
 /**
  * Retrieves the Node that the current node points to
  */ 
 public Node getNext()
 {
   return next;
 }
 
 
 public String getName()
 {
   return name;
 }
 
 
 public void setNext(Node node)
 {
   this.next = node;
 }
 

 public void setName(String name)
 {
   this.name = name;
   
 }
 
 public String toString() {
  return " Name : "+this.name;
 }
  
                       
}