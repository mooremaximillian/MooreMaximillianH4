public class Main
{
  
 public static void main(String [] args)
 {
   Node book1 = new Node("Book 1");
   Node book2 = new Node("Book 2");
   Node book3 = new Node("Book 3");
   Node book4 = new Node("Book 4");
    Node book5 = new Node("Book 5");
   Node book6 = new Node("Book 6");
   Node book7 = new Node("Book 7");
   Node book8 = new Node("Book 8"); 
   
   Stack collection = new Stack();
   Queue queue = new Queue();
   
   queue.setFront(book5);
   queue.setBack(book6);
   // queue.enqueue(book6);
    queue.enqueue(book7);
    queue.enqueue(book8);
    
   
   collection.push(book2);
   collection.push(book3);
   collection.push(book4);
   
   collection.print();
   
 
   queue.print();
   
   
   
 }
}