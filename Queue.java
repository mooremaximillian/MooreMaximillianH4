/**
 * This Class defines the info in each Node as well as the operations to the list and Node
 **/

public class Queue
{
  // initializes the names that will be included in lists
  String name;
 // intializes the next node
  Queue next;
 
 
 
 //Consturctor to input a new name 
 public Queue(String name, Queue n)
 {
   next = n;
   this.name = name;
   
 }
 /**
  * Constructor to just input the string
  */ 
 Queue(String n)
 {
   this(n, null);
 }
 /**
  * Retrieves the Node that the current node points to
  */ 
 public Queue getNext()
 {
   return next;
 }
 
 
 public String getName()
 {
   return name;
 }
 
 
 public void setNext(Queue queue)
 {
   this.next = queue;
 }
 

 public void setName(String name)
 {
   this.name = name;
   
 }
 
 public String toString() {
  return " Name : "+this.name;
 }
  
                       
}