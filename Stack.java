public class Stack
{
 private Node top = null;
   
   public Node peek()
 {
   
   return top;
}
 
 public void setTop(Node newNode)
 {
   this.top = newNode;
 }
 
 public void print()
 {
   if(this.isEmpty())
   {
     System.out.println("The list is empty mane");
   }
   else
   {
     Node tmp = this.top;
     while(tmp != null)
     {
       System.out.println(tmp);
       tmp = tmp.getNext();
     }
     System.out.println("");
   }
 }
        
        
        
 public boolean isEmpty()
 {
     return this.top == null;
   }
}
     
   