public class QueueList
{
  private Queue front = null;
  
  private Queue back = null;
  
  public void setFront(Queue newQueue)
  {
    this.front = newQueue;
  }
  public void setBack(Queue newQueue)
  {
    this.back = newQueue;
  }
  
  public void enqueue(Queue newQueue)
  {
    if(this.isEmpty())
      newQueue.setNext(this.front);
  }
  
  public boolean isEmpty()
 {
     return this.front == null;
   }
}