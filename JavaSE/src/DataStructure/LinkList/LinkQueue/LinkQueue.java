package DataStructure.LinkList.LinkQueue;

/**
 * Created by FY on 17/1/19.
 */
public class LinkQueue {
    private FirstLastLink theList;
    public LinkQueue(){
        theList=new FirstLastLink();
    }
    public boolean isEmpty(){
        return theList.isEmpty();
    }
    public void insert(int data){
        theList.insertLast(data);
    }
    public int remove(){
        return theList.deleteFirst();
    }
    public void displayQueue(){
        System.out.println("Queue:first->last:");
        theList.displayList();
        System.out.println();
    }

}
