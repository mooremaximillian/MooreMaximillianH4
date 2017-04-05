public class Queue
{
  private Node front = null;
  
  private Node back = null;
  
  public void setFront(Node newQueue)
  {
    this.front = newQueue;
  }
  public void setBack(Node newQueue)
  {
    this.back = newQueue;
  }
  
  public void enqueue(Node newQueue)
  {
    if(this.isEmpty())
    {
      this.back = newQueue;
      this.front = newQueue;
    }
    else
    {
      this.front.setNext(newQueue);
      this.front = newQueue;
      
    }
  }
  
  public Node dequque()
  {
    if(this.isEmpty())
      return null;
    else
    {
      Node tmp = this.front;
      this.front = back.getNext();
      if(this.front == null)
      
        this.back = null;
        return tmp;
    }
  }
        
        
  
   public void print()
 {
   if(this.isEmpty())
   {
     System.out.println("The list is empty mane");
   }
   else
   {
     Node tmp = this.front;
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
     return this.front == null;
   }
}