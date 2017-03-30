public class Main
{
  
 public static void main(String [] args)
 {
   Node book1 = new Node("Book 1");
   Node book2 = new Node("Book 2");
   Node book3 = new Node("Book 3");
   Node book4 = new Node("Book 4");
   
   Stack collection = new Stack();
   
   collection.setTop(book1);
   collection.setTop(book2);
   collection.setTop(book3);
   collection.setTop(book4);
   
   collection.print();
   
   
   
 }
}